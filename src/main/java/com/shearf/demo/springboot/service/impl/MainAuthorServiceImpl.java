package com.shearf.demo.springboot.service.impl;

import com.shearf.demo.springboot.domain.Author;
import com.shearf.demo.springboot.service.AuthorService;
import org.springframework.stereotype.Service;

/**
 * Created by xiahaihu2009@gmail on 2017/3/31.
 */
@Service("mainAuthorService")
public class MainAuthorServiceImpl implements AuthorService {
    @Override
    public Author getInfo() {
        Author author = new Author();
        author.setEmail("xiahaihu2009@gmail.com");
        author.setUsername("xiahaihu");
        return author;
    }
}
