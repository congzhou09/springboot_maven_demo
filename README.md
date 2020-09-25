#### 简介
♀将之前的[spring demo](https://github.com/congzhou09/spring_maven_demo)迁移为SpringBoot项目；

♀将所有Spring的xml配置改成注解方式实现；

#### 测试

♂SpringBoot方式启动项目：运行SpringbootMavenDemoApplication中的main函数；

♂访问 http://localhost:8080/user/about 返回Content-Type为 "text/html;charset=utf-8" 类型的字符串内容；

♂访问 http://localhost:8080/user/getList 返回Content-Type为 "application/json;charset=utf-8" 类型的JSON对象；

♂访问 http://localhost:8080/user/say 与 http://localhost:8080/role/say 除了返回字符串内容也会在say()方法调用前后在控制台打印信息；