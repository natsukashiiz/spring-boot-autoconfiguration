package com.natsukashiiz.boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = GreeterProperties.PREFIX)
@Data
public class GreeterProperties {
    public static final String PREFIX = "greeter";
    private String name;
    private String groupName;
}
