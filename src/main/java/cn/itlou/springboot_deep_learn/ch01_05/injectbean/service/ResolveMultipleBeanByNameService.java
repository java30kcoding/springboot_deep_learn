package cn.itlou.springboot_deep_learn.ch01_05.injectbean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuanyl
 * @date 2021/4/17 15:38
 **/
@Service
public class ResolveMultipleBeanByNameService {

//    private Animal animal;
//    @Autowired(required = false)
//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }
    @Autowired
    private Animal dog;

    public void use() {
        dog.use();
    }

}
