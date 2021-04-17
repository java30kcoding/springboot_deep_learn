package cn.itlou.springboot_deep_learn.ch01_05.assemblebean.scanconfig;

import cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo.NotUseBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author yuanyl
 * @date 2021/4/15 19:34
 **/
@Configuration
// 使用Filter排除需要注入的Bean如果FilterType为CUSTOM，需要重写TypeFilter
@ComponentScan(basePackages = {"cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo"},
excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {NotUseBean.class})})
public class UserConfigScan {

}
