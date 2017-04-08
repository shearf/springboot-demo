package com.shearf.demo.springboot.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.shearf.demo.springboot.domain.MyBean;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by xiahaihu2009@gmail on 2017/4/1.
 */
@Configuration
public class MyConfiguration implements EnvironmentAware {

    private RelaxedPropertyResolver resolver;

//    @Bean
//    public HttpMessageConverters converters() {
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        return new HttpMessageConverters(fastJsonHttpMessageConverter);
//    }

    @Override
    public void setEnvironment(Environment environment) {
        resolver = new RelaxedPropertyResolver(environment);
    }

    @Bean
    public MyBean MyPropertiesBean() {
        MyBean myBean = new MyBean();
        myBean.setUsername(resolver.getProperty("my.username"));
        return myBean;
    }
}
