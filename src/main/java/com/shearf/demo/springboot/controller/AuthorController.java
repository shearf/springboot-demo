package com.shearf.demo.springboot.controller;

import com.shearf.demo.springboot.domain.Author;
import com.shearf.demo.springboot.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiahaihu2009@gmail on 2017/3/31.
 */
@RestController
@RequestMapping("author")
public class AuthorController {

    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    private final AuthorService authorService;

    @Autowired
    public AuthorController(@Qualifier("mainAuthorService") AuthorService authorService) {
        logger.info("查看作者信息");
        this.authorService = authorService;
    }

    @GetMapping("info")
    public Author info() {
        return authorService.getInfo();
    }
}
