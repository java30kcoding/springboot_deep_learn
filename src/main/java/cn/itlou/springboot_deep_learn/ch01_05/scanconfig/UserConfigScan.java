package cn.itlou.springboot_deep_learn.ch01_05.scanconfig;

import cn.itlou.springboot_deep_learn.ch01_05.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanyl
 * @date 2021/4/15 19:34
 **/
@Configuration
@ComponentScan(basePackages = {"cn.itlou.springboot_deep_learn.ch01_05.pojo"})
public class UserConfigScan {

}
