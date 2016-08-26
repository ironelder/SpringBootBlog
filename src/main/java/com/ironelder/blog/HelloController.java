package com.ironelder.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016-08-25.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name", "SpringBlog form ironelder");
        return "hellojsp";
    }
}
