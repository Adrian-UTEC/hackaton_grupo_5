package com.example.demo.event;

import com.example.demo.Email.domain.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @Autowired
    private EmailService emailService;

    @EventListener
    @Async
    public void handleEmailEvent(emailEvent event){
        emailService.sendConfirmationMessage(event.getEmail(), "Correo de confirmación de reserva", "Su reserva fue ejecutada con éxito! Gracias por reservar salones con nosotros.");
    }

}
