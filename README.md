# springCloud

基于springboot学习了eureka实现注册中心的原理 
了解springboot的自动装配以及如何实现自动装配原理。
了解自动装配后理解组件式开发。

以及引入的组件如何查看自动装配的内容：
1.META-INF文件下的spring.factories文件
2.被自动装配的实现类以（key,value）形式存储。
##org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
##org.springframework.cloud.netflix.eureka.config.EurekaClientConfigServerAutoConfiguration,\

集成了fegin组件实现了服务间调用


