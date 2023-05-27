package com.example.practice16.services;

import com.example.practice16.models.Author;
import com.example.practice16.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendAddAuthorEmail(Author author){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("Mimimamumu");
        message.setTo("parusov.pashka@ya.ru");
        message.setSubject("Message texting that method was activated");
        message.setText(author.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }

    @Async
    public void sendAddBookEmail(Book book){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("Mimimamumu");
        message.setTo("parusov.pashka@ya.ru");
        message.setSubject("Message texting that method was activated");
        message.setText(book.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}
