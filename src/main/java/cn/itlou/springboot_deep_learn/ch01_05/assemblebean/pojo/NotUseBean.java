package cn.itlou.springboot_deep_learn.ch01_05.assemblebean.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yuanyl
 * @date 2021/4/15 20:07
 **/
@Component
@Data
public class NotUseBean {

    @Value("1")
    private Long id;
    @Value("yyl")
    private String name;
    @Value("姓名")
    private String note;

}
