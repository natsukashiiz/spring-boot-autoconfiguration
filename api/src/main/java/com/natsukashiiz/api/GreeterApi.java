package com.natsukashiiz.api;

import com.natsukashiiz.boot.GreeterProperties;
import com.natsukashiiz.boot.GreeterService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class GreeterApi {
    private final GreeterService greeterService;
    private final GreeterProperties greeterProperties;

    public GreeterApi(GreeterService greeterService, GreeterProperties greeterProperties) {
        this.greeterService = greeterService;
        this.greeterProperties = greeterProperties;
    }

    @GetMapping("/who")
    @ConditionalOnBean({GreeterService.class})
    public String who() {
        return greeterService.who();
    }

    @GetMapping("/whox")
    @ConditionalOnBean({GreeterService.class})
    public String whox() {
        return greeterProperties.toString();
    }
}
