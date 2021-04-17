package cn.itlou.springboot_deep_learn.ch01_05.injectbean.service;

import org.springframework.stereotype.Service;

/**
 * @author yuanyl
 * @date 2021/4/17 15:33
 **/
@Service
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫猫猫");
    }
}
