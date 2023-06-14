package com.natsukashiiz.boot;

import lombok.Data;
import lombok.NonNull;

@Data
public class GreeterService {
    @NonNull
    private String name;
    @NonNull
    private String idolGroupName;

    public String who() {
        return String.format("Hello~ it's me! %s  %s.", name, idolGroupName);
    }
}
