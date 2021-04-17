package cn.itlou.springboot_deep_learn.ch01_05.assemblebean.scanconfig;

import cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo.UserScan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author yuanyl
 * @date 2021/4/15 19:37
 **/
@Slf4j
public class IocScanTest {

    public static void main(String[] args) {
        // 2.0.0为ApplicationContext 有变化
        GenericApplicationContext context = new AnnotationConfigApplicationContext(UserConfigScan.class);
        UserScan user = context.getBean(UserScan.class);
        log.info(user.toString());
//        NotUseBean user1 = context.getBean(NotUseBean.class);
//        log.info(user1.toString());
    }

}
