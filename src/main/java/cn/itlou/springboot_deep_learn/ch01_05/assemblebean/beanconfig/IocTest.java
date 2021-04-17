package cn.itlou.springboot_deep_learn.ch01_05.assemblebean.beanconfig;

import cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author yuanyl
 * @date 2021/4/15 19:37
 **/
@Slf4j
public class IocTest {

    public static void main(String[] args) {
        // 2.0.0为ApplicationContext 有变化
        GenericApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean(User.class);
        log.info(user.toString());
    }

}
