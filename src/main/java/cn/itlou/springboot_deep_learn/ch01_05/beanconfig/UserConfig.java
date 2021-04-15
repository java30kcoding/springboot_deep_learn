package cn.itlou.springboot_deep_learn.ch01_05.beanconfig;

import cn.itlou.springboot_deep_learn.ch01_05.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanyl
 * @date 2021/4/15 19:34
 **/
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
