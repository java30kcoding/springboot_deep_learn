package cn.itlou.springboot_deep_learn.ch01_05.injectbean.config;

import cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo.NotUseBean;
import cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author yuanyl
 * @date 2021/4/15 19:34
 **/
@Configuration
// 使用Filter排除需要注入的Bean如果FilterType为CUSTOM，需要重写TypeFilter
@ComponentScan(basePackages = {"cn.itlou.springboot_deep_learn.ch01_05.injectbean"})
public class AnimalConfig {

}
