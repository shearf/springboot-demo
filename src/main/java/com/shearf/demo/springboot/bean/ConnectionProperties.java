package com.shearf.demo.springboot.bean;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by xiahaihu2009@gmail on 2017/4/1.
 */
@ConfigurationProperties(prefix = "connection")
@Data
public class ConnectionProperties {

    @NotNull
    @Valid
    private RemoteAddress remoteAddress;

    public static class RemoteAddress {

        @NotEmpty
        private String hostname;
    }
}
