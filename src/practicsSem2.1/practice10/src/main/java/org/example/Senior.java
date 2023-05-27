package org.example;

import org.springframework.stereotype.Component;

@Component
public class Senior implements Programmer {
    public void doCoding() {
        System.out.println("Senior coding");
    }
}
