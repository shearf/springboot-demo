package com.shearf.demo.springboot;

import com.shearf.demo.springboot.bean.ConnectionProperties;
import com.shearf.demo.springboot.config.HttpConfig;
import com.shearf.demo.springboot.domain.MyBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xiahaihu on 17/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@PropertySource("classpath:database.properties")
public class ProfileTests {

    @Value("${current.profile}")
    private String currentProfile;

    @Autowired
    private MyBean myBean;

    private ConnectionProperties connectionProperties;

    @Value("${http.url}")
    private String httpUrl;

    @Autowired
    private HttpConfig httpConfig;

    @Value("${database.username}")
    private String databaseUsername;

    @Value("${my.username}")
    private String myUsername;

    @Value("${custom.value}")
    private String customValue;

    @Test
    public void currentProfileTest() {
        Assert.assertTrue(currentProfile.equals("dev"));
    }

    @Test
    public void envValueTest() {
        System.out.println(httpConfig.getUrl());

        Assert.assertTrue(httpConfig.getUrl().equals("http://dev.localhost"));
    }

    @Test
    public void getBeanValueTest() {
        String url = httpConfig.getUrl();

        System.out.println(url);
    }

    @Test
    public void getAdditionalFilePropertiesTest() {
        System.out.println(databaseUsername);
//        Assert.assertTrue(databaseUsername.equals("root"));
        System.out.println(myUsername);
        System.out.println(customValue);

        System.out.println(myBean.getUsername());
    }

}
