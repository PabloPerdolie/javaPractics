package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${name}")
    private String name;
    @Value("${lastName}")
    private String lastName;
    @Value("${group}")
    private String group;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
