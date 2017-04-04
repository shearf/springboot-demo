package com.shearf.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@RestController
@RequestMapping("foo")
public class FooController {

    @RequestMapping("test")
    public String test() {
        throw new RuntimeException("foot test");
    }
}
