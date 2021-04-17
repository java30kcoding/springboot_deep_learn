package cn.itlou.springboot_deep_learn.ch01_05.injectbean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author yuanyl
 * @date 2021/4/17 15:38
 **/
@Service
public class ResolveMultipleBeanByConstructorService {

//    private Animal animal;
//    @Autowired(required = false)
//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }
    private Animal animal;

    @Autowired
    public ResolveMultipleBeanByConstructorService(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void use() {
        animal.use();
    }

}
