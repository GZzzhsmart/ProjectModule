package top.zywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 自动跳转到首页
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public String core(){
        return "/index";
    }

}
