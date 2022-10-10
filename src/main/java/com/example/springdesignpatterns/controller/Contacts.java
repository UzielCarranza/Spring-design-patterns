package com.example.springdesignpatterns.controller;

import com.example.springdesignpatterns.builder.ContactsBuilder;
import com.example.springdesignpatterns.factory.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Contacts {

    @GetMapping("/presidents")
    public List<Contact> getPresidents(){
        List<Contact> presidents = new ArrayList<>();
        presidents.add(new ContactsBuilder().setFirstName("name").setLastName("latName").buildContact());
        presidents.add(new ContactsBuilder().setLastName("latName").buildContact());
        presidents.add(new ContactsBuilder().setEmailAddress("email address").buildContact());
        return presidents;
    }
}
