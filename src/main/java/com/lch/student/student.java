package com.lch.student;

import org.springframework.beans.factory.annotation.Value;

public class student {
    @Value("单泽伟")
    String name;
    @Value("19030305")
    String id;

    @Override
    public String toString() {
        return "name:" + name + ", id:=" + id + ".";
    }
}

