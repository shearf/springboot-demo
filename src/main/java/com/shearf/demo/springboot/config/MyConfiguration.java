package com.shearf.demo.springboot.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiahaihu2009@gmail on 2017/4/1.
 */
@Configuration
public class MyConfiguration {

    @Bean
    public HttpMessageConverters converters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        return new HttpMessageConverters(fastJsonHttpMessageConverter);
    }
}
