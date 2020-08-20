# shoulder-platform

管理了shoulder平台微服务开发中常用的jar

包含以下：
- 服务发现 & 注册
- 对接统一配置中心
- 链路追踪
- 服务指标监控
- 服务调用
- 服务提供
    - 包含如 `spring-boot-starter-web`、`shoulder-starter-web` 参数校验、参数转换、统一异常处理等
 

使用：

```xml
    <!-- WEB/db/mq/discovery/config/monitor/trace -->
    <dependency>
        <groupId>cn.itlym.platform</groupId>
        <artifactId>shoulder-platform-starter-micro</artifactId>
    </dependency>
```