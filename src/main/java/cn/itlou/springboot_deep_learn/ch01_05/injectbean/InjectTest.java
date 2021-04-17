package cn.itlou.springboot_deep_learn.ch01_05.injectbean;

import cn.itlou.springboot_deep_learn.ch01_05.injectbean.config.AnimalConfig;
import cn.itlou.springboot_deep_learn.ch01_05.injectbean.service.ResolveMultipleBeanByAnnotationService;
import cn.itlou.springboot_deep_learn.ch01_05.injectbean.service.ResolveMultipleBeanByConstructorService;
import cn.itlou.springboot_deep_learn.ch01_05.injectbean.service.ResolveMultipleBeanByNameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author yuanyl
 * @date 2021/4/15 19:37
 **/
@Slf4j
public class InjectTest {

    public static void main(String[] args) {
        // 2.0.0为ApplicationContext 有变化
        GenericApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
        ResolveMultipleBeanByNameService resolveMultipleBeanByNameService = context.getBean(ResolveMultipleBeanByNameService.class);
        resolveMultipleBeanByNameService.use();
        ResolveMultipleBeanByAnnotationService resolveMultipleBeanByAnnotationService = context.getBean(ResolveMultipleBeanByAnnotationService.class);
        resolveMultipleBeanByAnnotationService.use();
        ResolveMultipleBeanByConstructorService resolveMultipleBeanByConstructorService = context.getBean(ResolveMultipleBeanByConstructorService.class);
        resolveMultipleBeanByConstructorService.use();
    }

}
