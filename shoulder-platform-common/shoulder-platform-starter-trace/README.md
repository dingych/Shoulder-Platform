# shoulder-platform-starter-trace

统一链路追踪技术方案。

选型指南，符合业界规范：OpenTracing；低入侵。

主流：
- Zipkin（Twitter 提供。大规模应用，UI较弱）
- Skywalking（国产优秀开源项目。高性能，shoulder 最初对接方案）

- Pinpoint（韩国。记录数据详细、UI强大，非 `OpenTracing`）
- CAT（大众点评。UI强大，代码侵入，非 `OpenTracing`）

这里推荐 Skywalking，但其服务端会比其他两个消耗更多的资源（CPU、内存）。

由于这三者均可以做到代码无入侵，选型平滑切换。为了减少资源占用 Shoulder 默认选用了 `Zipkin`

https://www.jianshu.com/p/92a12de11f18