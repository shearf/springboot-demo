package com.shearf.demo.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xiahaihu on 17/4/1.
 */

@ConfigurationProperties(prefix = "http")
@Data
@Component
public class HttpConfig {

    private String url;
}
