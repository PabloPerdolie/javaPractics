package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(test.class);
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getGroup() + ", " + student.getName() + ", " + student.getLastName());
        context.close();
    }
}
