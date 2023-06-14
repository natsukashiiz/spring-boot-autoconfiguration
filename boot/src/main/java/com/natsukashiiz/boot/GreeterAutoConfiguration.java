package com.natsukashiiz.boot;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
@EnableConfigurationProperties({GreeterProperties.class})
public class GreeterAutoConfiguration {
    private final GreeterProperties greeterProperties;

    public GreeterAutoConfiguration(GreeterProperties greeterProperties) {
        this.greeterProperties = greeterProperties;
    }

    @Bean
    @ConditionalOnMissingBean(GreeterService.class)
    public GreeterService greeterService() {
        GreeterService greeterService = new GreeterService();
        greeterService.setName(greeterProperties.getName());
        greeterService.setIdolGroupName(greeterProperties.getGroupName());
        return greeterService;
    }
}
