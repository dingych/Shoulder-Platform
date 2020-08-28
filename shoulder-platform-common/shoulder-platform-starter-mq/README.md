# shoulder-platform-starter-mq

包含如 `RabbitMQ`、`spring cloud stream`等

MQ 技术选型：
- ~~ActiveMQ~~
- RabbitMQ
    - 使用广泛，功能全面，默认选型
- KafKa、RocketMQ
    - 适用于堆积场景，大数据量场景，如追踪日志、监控日志、操作日志等数据流
    - 其中 KafKa 由于使用广泛且诞生较早，第三方支持更全面，更推荐
    - RocketMQ 更适用于纯 Java 系统，性能较高一点
- Plusar
    - 高性能，性能随节点数线性扩展
    - 功能强大支持租户
    - 较新，文档和经验较少，准备选型