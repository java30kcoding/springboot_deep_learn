package cn.itlou.springboot_deep_learn.ch01_05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuanyl
 * @date 2021/4/14 21:17
 **/
@Controller
public class IndexController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
