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

## IOC容器

### 定义Bean

```java
@Data
public class User {
    private Long id;
    private String name;
    private String note;
}
```

### 定义配置类

```java
@Configuration
public class UserConfig {
    @Bean("user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setName("yyl");
        user.setNote("姓名");
        return user;
    }
}
```

### 读取配置，装配Bean

```java
@Slf4j
public class IocTest {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean(User.class);
        log.info(user.toString());
    }
}
```

### 其他方式装配Bean

> 见scanconfig包下的代码

### 排除不需要装配的Bean

```java
//使用Filter排除需要装配的Bean如果FilterType为CUSTOM，需要重写TypeFilter
@ComponentScan(basePackages = {"cn.itlou.springboot_deep_learn.ch01_05.pojo"},
excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {NotUseBean.class})})
```

```java
public class MyFilterType implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        if (metadataReader.getClassMetadata().getClassName().contains("Department")){
            //获取当前类注解的信息
            AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
            for (String s : annotationMetadata.getAnnotationTypes()) {
                System.out.println("当前正在被扫描的类注解类型" + s);
            }
            //获取当前正在扫描类的信息
            ClassMetadata classMetadata = metadataReader.getClassMetadata();
            System.out.println("当前正在被扫描的类的类名" + classMetadata.getClassName());
            //获取当前类的资源信息（类存放的路径...）
            Resource resource = metadataReader.getResource();
            System.out.println("当前正在被扫描的类存放的地址" + resource.getURL());
            return true;
        }
        // false时不装配到容器中
        return false;
    }
}
```

## 依赖注入

### @Autowired

> 通过BeanFactory的getBean(Class<T> clz)获取装配到容器中的Bean

### 同类型的Bean注入问题

> NoUniqueBeanDefinitionException: No qualifying bean of type 'xx' available: expected single matching bean but found x

#### 解决方案

+ 修改属性名为多个实现的其中一个
+ 使用@Primary或@Quelifier
+ 使用有参构造器注入(Spring官方推荐使用这种方式注入Bean，如果直接使用Autowired Idea也会警告)















