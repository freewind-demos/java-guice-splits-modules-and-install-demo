Java Guice Manual Inject Demo
=============================

只使用了最简单的`@Inject`注解来声明，注入过程使用guice api手动操作，这是最原始的办法。

注意：
1. 如果某个需要Inject的类不是接口，直接是class，并且构造函数无参数，则不需要bind

Run `example.Main` in your IDE
