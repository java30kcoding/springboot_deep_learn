package cn.itlou.springboot_deep_learn.ch01_05.injectbean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author yuanyl
 * @date 2021/4/17 15:38
 **/
@Service
public class ResolveMultipleBeanByAnnotationService {

    @Qualifier("cat")
    // 也可以在其中一个类上添加 @Primary 注解
    @Autowired
    private Animal animal;

    public void use() {
        animal.use();
    }

}
