# shoulder-platform

API Gateway

该网关一般不直接与外界交互，一般位于代理网关（Apach、nginx、openResty、Kong）之后，而API 网关的后端是微服务的集群。

接入层网关：安全、限流、日志、监控、缓存（业务无关）

API 服务网关：超时、缓存、熔断、重试、查询聚合、数据校验（时间、方法、版本、AppKey、签名）
【贴近业务】

实际应用中，也可以根据自己的设计，将代理网关的能力赋予 API gateway 中。

