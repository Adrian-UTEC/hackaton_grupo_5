package com.example.demo.event;

import org.springframework.context.ApplicationEvent;
import org.stringtemplate.v4.ST;

public class emailEvent extends ApplicationEvent {

    private final String email;

    public emailEvent(String email){
        super(email);
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

}
