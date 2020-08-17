package cn.itlym.shoulder.platform.gateway.client.impl;

import cn.itlym.shoulder.platform.gateway.client.ServiceTokenClient;
import cn.itlym.shoulder.platform.gateway.client.dto.param.DeleteServiceTokenParam;
import lombok.extern.slf4j.Slf4j;
import org.shoulder.core.dto.response.BaseResponse;
import org.shoulder.core.exception.BaseRuntimeException;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * 调用访问管理服务 ST 接口实现
 *
 * @author lym
 */
@Slf4j
public class ServiceTokenClientImpl implements ServiceTokenClient {


    /**
     * 使用 accessToken 换取 serviceToken 接口路径
     */
    private static final String GET_ST_BY_ACCESS_TOKEN_URI = "/api/authentication/st/get?accessToken=%s&appId=%s";

    /**
     * 删除 ST 接口路径
     */
    private static final String DELETE_ST_URI = "/api/authentication/st/delete";

    private WebClient webClient;

    public ServiceTokenClientImpl(String accessManagerServiceUrl) {
        webClient = WebClient.create(accessManagerServiceUrl);
    }

    @Override
    public Mono<String> getServiceToken(String accessToken, String appId) {
        return webClient
                .post().uri(String.format(GET_ST_BY_ACCESS_TOKEN_URI, accessToken, appId))
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(BaseResponse.class)
                .map(BaseResponse::getData)
                .cast(Map.class)
                .map(map -> map.get("st"))
                .cast(String.class)

                .onErrorResume(e -> {
                    log.warn("get ST fail by [token=" + accessToken + ",appId=" + appId + "]");
                    throw new BaseRuntimeException("get ST fail", e);
                });
    }

    @Override
    public Mono<Void> deleteServiceToken(String serviceToken) {
        DeleteServiceTokenParam deleteServiceTokenParam = new DeleteServiceTokenParam();
        deleteServiceTokenParam.setSt(serviceToken);

        return webClient.post().uri(DELETE_ST_URI)
                .bodyValue(deleteServiceTokenParam)
                .retrieve()
                .bodyToFlux(DataBuffer.class)
                .map(DataBufferUtils::release)
                .then();
    }

}
