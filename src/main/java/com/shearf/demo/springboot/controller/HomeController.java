package com.shearf.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiahaihu2009@gmail on 2017/4/2.
 */
@Controller
public class HomeController {

    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
