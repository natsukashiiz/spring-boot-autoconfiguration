package com.natsukashiiz.boot;

import lombok.Data;

@Data
public class GreeterService {
    private String name;
    private String idolGroupName;

    public String who() {
        return String.format("Hello~ it's me! %s  %s.", name, idolGroupName);
    }
}
