package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

@Component
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
    private String ipAddress;
    @Max(value = 8888, message = "no bigger than 8888")
    private int port;
    private long timeout;
}
