package com.shearf.demo.springboot;

import com.shearf.demo.springboot.bean.ConnectionProperties;
import com.shearf.demo.springboot.config.HttpConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xiahaihu on 17/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileTests {

    @Value("${current.profile}")
    private String currentProfile;

    private ConnectionProperties connectionProperties;

    @Value("${http.url}")
    private String httpUrl;

    @Autowired
    private HttpConfig httpConfig;

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

    }

}
