# spring-cloud-learning

本项目主要是对spring cloud的搭建配置的一个例子

### 项目介绍
- cloud-config-server 分布式配置管理服务
- cloud-eureka-server 服务注册发现服务端
- cloud-hystrix-dashboard 断路器dashboard
- cloud-provider-service restapi 服务端
- cloud-simple-helloworld 简单的spring boot项目
- cloud-simple-service 数据库访问service
- cloud-simple-ui 应用消费端
- cloud-zuul-gateway 服务网关



### 项目统一依赖包
- parent 统一配置依赖parent




### 根据骨架项目定义脚手架     
###### 如： cloud-simple-service 

* 1).先定义项目模板；
     
* 2).在项目根目录下执行mvn archetype:create-from-projecct 生成archetype结构；
     
* 3).跳到项目根目录下的target\generated-sources\archetype目录，删除或修改必要的信息;
         
* 4）.在target\generated-sources\archetype  > mvn install  执行mvn install 将archetype安装到本地;
     
* 5）.最后在 target\generated-sources\arche>mvn  deploy  最好发布到私服。


查看本地的archetype 可以执行：  mvn archetype:generate -DarchetypeCatalog=local   
     

官网的maven-archtype-plugin  ：
https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html

