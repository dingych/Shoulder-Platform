# shoulder-platform-starter-rpc-client

包含如 `Feign`、`Ribbon` 、统一认证客户端等

rpc 客户端包含以下功能，以及 shoulder 中的技术选型

- 服务发现，自动寻址
    - nacos-discovery-client
- 负载均衡
    - Ribbon
- 简化调用
    - Feign
- 服务间调用认证
    - 支持 RestTemplate
    - 支持 Feign
    
- 先控制并发再熔断最后重试

- 缓存（与业务相关，默认不提供）
    - 调用后缓存结果
    - 有缓存或熔断时使用缓存，自己决定
    