package com.ironelder.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016-08-31.
 */
@Controller
public class UserController {
    @RequestMapping(value="/user/login", method= RequestMethod.GET)
    public String login() {
        return "auth/login";
    }
}