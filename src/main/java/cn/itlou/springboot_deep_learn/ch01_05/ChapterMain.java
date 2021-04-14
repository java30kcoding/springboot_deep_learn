package cn.itlou.springboot_deep_learn.ch01_05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanyl
 * @date 2021/4/14 20:46
 **/
@RestController
public class ChapterMain {

    @GetMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map map = new HashMap<String, String>();
        map.put("name", "yyl");
        return map;
    }

}
