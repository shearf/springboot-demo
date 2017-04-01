package com.shearf.demo.springboot.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by xiahaihu2009@gmail on 2017/4/1.
 */
@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Before Application Run");
    }
}
