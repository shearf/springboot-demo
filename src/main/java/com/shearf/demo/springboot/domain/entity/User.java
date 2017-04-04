package com.shearf.demo.springboot.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@Data
//@Repository
public class User {

    private Integer id;

    private String name;

    private String email;

    private String displayName;

    private String status;

    private String rememberToken;

    private String password;

    private Date createdAt;

    private Date updatedAt;
}
