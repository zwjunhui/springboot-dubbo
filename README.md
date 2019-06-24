# 基于Springboot2.0的Dubbo入门项目（dubbo-spring-boot-starter）

Dubbo是阿里巴巴公司开源的一个高性能优秀的服务框架，使得应用可通过高性能的 RPC 实现服务的输出和输入功能，可以和Spring框架无缝集成。最近半年来，Dubbo的得到了快速的维护，官方也推出了集成Springboot的jar包，及其贴合时代潮流，那么现在就来讲Springboot2.0如何集成官方Dubbo。


## **Springboot快速集成Dubbo关键的依赖**
```maven
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>0.2.0</version>
</dependency>
```



## **运行项目**

首先启动服务提供者，在启动服务调用者，打开谷歌浏览器，输入[http://localhost:端口号/sayHello](http://localhost:端口号/sayHello)

