# springboot_deep_learn

> 深入学习书籍《深入浅出Spring Boot2.x》及其随笔

# 第1-2章

## 配置文件加载顺序

+ 命令行参数：-Dspirng.xxx
+ 来自java:comp/env的JNDI属性
+ java系统属性：System.getProperties()
+ 操作系统环境变量
+ RandomValuePropertySource配置的random.*属性
+ jar包外部的application-{profile}.yml(带Spring.profile)配置文件
+ jar包内部的application-{profile}.yml(带Spring.profile)配置文件
+ jar包外部的application.yml(不带Spring.profile)配置文件
+ jar包内部的application.yml(不带Spring.profile)配置文件
+ @Configuration注解的@PropertySource
+ 通过SpringApplication.setDefaultProperties指定的默认属性

## 视图解析器

>  SpringMvc的视图解析器主要作用是定位视图，即将返回的字符串解析为视图(页面)

### 引入JSP相关依赖

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>
```

### 定义视图前后缀

```yaml
spring:
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp
```

> 也可以通过在启动类中定义Bean的形式设置

```java
@Bean//注册视图解析器
public InternalResourceViewResolver setupViewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    return resolver;
}
```

### 注意事项

> 不要使用RestController注解





















