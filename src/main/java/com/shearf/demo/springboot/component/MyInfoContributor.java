package com.shearf.demo.springboot.component;

import com.shearf.demo.springboot.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * Created by xiahaihu2009@gmail on 2017/4/8.
 */
@Component
public class MyInfoContributor implements InfoContributor {

    @Qualifier("mainAuthorService")
    @Autowired
    private AuthorService authorService;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("author", authorService.getInfo());
    }
}
