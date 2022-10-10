package com.example.springdesignpatterns.builder;

import com.example.springdesignpatterns.factory.Contact;

//BUILDER PATTERN

public class ContactsBuilder {
//    build method returns a fully constructed object

//    each method returns the object reference it's called from

//    useful when object creation has many parameters
//    becomes more useful when some or all parameters are optional

    private String firstName;
    private String lastName;
    private String emailAddress;

    public ContactsBuilder setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public ContactsBuilder setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public ContactsBuilder setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public Contact buildContact(){
        return new Contact(firstName,lastName,emailAddress);
    }
}
