package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Programmers.class);
        Middle middle = context.getBean("middle", Middle.class);
        middle.doCoding();
        Senior senior = context.getBean("senior", Senior.class);
    }
}
