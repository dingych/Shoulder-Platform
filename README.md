# shoulder-platform

[![AUR](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](https://github.com/ChinaLym/Shoulder-Platform)
[![](https://img.shields.io/badge/Author-lym-blue.svg)](https://github.com/ChinaLym)
[![](https://img.shields.io/badge/version-1.0-brightgreen.svg)](https://github.com/ChinaLym/Shoulder-Platform)
[![GitHub stars](https://img.shields.io/github/stars/ChinaLym/Shoulder-Framework.svg?style=social&label=Stars)](https://github.com/ChinaLym/Shoulder-Platform/stargazers)
[![star](https://github.com/ChinaLym/Shoulder-Platform/badge/star.svg?theme=white)](https://github.com/ChinaLym/Shoulder-Platform/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/ChinaLym/Shoulder-Framework.svg?style=social&label=Fork)](https://github.com/ChinaLym/Shoulder-Framework/network/members)
[![fork](https://github.com/ChinaLym/Shoulder-Platform/badge/fork.svg?theme=white)](https://github.com/ChinaLym/Shoulder-Platform/members)


## 简介：

`shoulder-platform` 是一个 `SaaS` 平台（仅实现基础能力，不包含具体业务），代码简洁，架构清晰，非常适合学习使用。

- 能力
	- 单点登录
    - 用户管理
	- 资源权限管理
    - 通知推送中心（短信、邮件）
    
- 核心框架
    - `SpringBoot` 
    - `SpringCloud`
    - `Shoulder Framework`
    
- 微服务治理方案选型
    - 服务注册、发现
        - nacos
    - 服务调用
        - feign
    - 负载均衡
        - Ribbon
    - 限流 & 断路器
        - sentinel
    - 服务认证
        - Spring Security（JWT）
    - 配置中心
        - nacos
    - 消息通知
        - rabbitMQ
    - 配置中心
        - nacos
    - 链路追踪
        - zipkin
    - 文件存储
        - ceph
    - 服务监控
        - spring-boot-admin
    - 日志收集
        - EFK（Elastic Search + Fluentd + Kibana）
    - 监控、可视化、报警
        - spring-boot-actuator、Prometheus、Grafana、Alert Manager
    - 持续集成、持续部署（不限制）
        - Jenkins、Drone、Docker
    - 分布式任务中间件
        - Power Job
    - 灰度发布
        - 依赖 Ribbon
    

## 架构图
https://app.diagrams.net/

![架构图.png](img/architecture.png)


## 启动与使用

- IDEA
- jar
- docker
    
## 如果觉得对您有帮助，请点右上角 "Star" 支持一下吧，谢谢！

## 文档

## 展示

#### 监控

![prometheus + grafana 监控 docker](img/docker.png)

![监控redis](img/docker.png)


## 项目代码地址

| 项目 | 开源地址 | 说明 |
|---|---|---|
| Shoulder Framework | [github](https://github.com/ChinaLym/Shoulder-Framework)、[gitee](https://gitee.com/ChinaLym/shoulder-framework) | 开发框架，在 Spring Boot 基础之上，结合[软件优雅设计与开发最佳实践](http://spec.itlym.cn)，增加常用的功能，任何基于`Spring Boot`/`Spring Cloud`的项目都可以使用。 |
| Shoulder Platform | [github](https://github.com/ChinaLym/Shoulder-Platform)、[gitee](https://gitee.com/ChinaLym/shoulder-Platform) | SaaS 开发平台，提供了基础通用能力，与具体业务无关 |
| shoulder-framework-demo | [github](https://github.com/ChinaLym/shoulder-framework-demo)、[gitee](https://gitee.com/ChinaLym/shoulder-framework) | 以简单的例子介绍 `Shoulder Framework` 的使用 |
| shoulder-plugins | [github](https://github.com/ChinaLym/shoulder-plugins)、[gitee](https://gitee.com/ChinaLym/shoulder-plugins) | shoulder 提供的的减少开发工作量的`maven`插件（非必须，如遵循[软件优雅设计与开发最佳实践-国际化开发](http://doc.itlym.cn/specs/base/i18n.html)时推荐希望使用自动生成多语言翻译资源文件的插件减少开发工作量） |
| shoulder-lombok | [github](https://github.com/ChinaLym/shoulder-lombok)、[gitee](https://gitee.com/ChinaLym/shoulder-lombok) | 在`lombok`之上，增加 `@SLog` 注解，用于简化[软件优雅设计与开发最佳实践-错误码与日志](http://spec.itlym.cn/specs/base/errorCode.html) -shoulder 实现的日志框架的使用（非必须） |
| shoulder-lombok-idea-plugin | [github](https://github.com/ChinaLym/lombok-intellij-plugin)、[gitee](https://gitee.com/ChinaLym/lombok-intellij-plugin) | 在 `lombok-idea-plugin`之上，在 IDEA 中增加`@SLog`的编码提示，以更好的使用 `shoulder-lombok`（非必须，使用 shoulder-lombok 时推荐） |
