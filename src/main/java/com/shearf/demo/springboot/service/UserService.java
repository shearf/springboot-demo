package com.shearf.demo.springboot.service;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */

import com.shearf.demo.springboot.domain.entity.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
}
