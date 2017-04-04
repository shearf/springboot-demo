package com.shearf.demo.springboot.controller;

import com.shearf.demo.springboot.domain.entity.User;
import com.shearf.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> index() {
        return userService.listUsers();
    }
}
