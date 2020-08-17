package cn.itlym.shoulder.platform.gateway;

import org.shoulder.core.dto.response.BaseResponse;
import org.shoulder.core.exception.CommonErrorCodeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

/**
 * 网关启动类
 *
 * @author lym
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ShoulderGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoulderGatewayApplication.class, args);
    }

    @RequestMapping("/fallback")
    public Mono<BaseResponse> fallback() {
        return Mono.just(BaseResponse.error(CommonErrorCodeEnum.REQUEST_TIMEOUT));
    }
}
