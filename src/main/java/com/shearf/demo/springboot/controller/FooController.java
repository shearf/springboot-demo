package com.shearf.demo.springboot.controller;

import com.shearf.demo.springboot.config.HttpConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@RestController
@RequestMapping("foo")
@PropertySource("classpath:database.properties")
public class FooController {

    @Autowired
    private HttpConfig httpConfig;

    @Value("${database.username}")
    private String databaseUsername;

    @RequestMapping("test")
    public String test() {
        return databaseUsername;
    }

    @GetMapping("t_url")
    public String testHttpUrl() {
        return httpConfig.getUrl();
    }

}
