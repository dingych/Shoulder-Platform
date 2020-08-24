# shoulder-platform-starter-rpc-server

包含如 `spring-boot-starter-web`、`shoulder-starter-web` 参数校验、参数转换、统一异常处理等

- 请求限流
    - `Sentinel`
- 熔断
    - 当必需依赖无法使用时，返回熔断值，（如数据库无法连接、依赖的其他服务无法正确响应）
- 降级
    - 返回默认值
    - 返回缓存值
    - 返回失败
- 缓存
    - `spring-cache`