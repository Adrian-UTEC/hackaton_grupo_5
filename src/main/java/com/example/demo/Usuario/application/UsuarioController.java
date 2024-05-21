package com.example.demo.Usuario.application;

import com.example.demo.Usuario.domain.UsuarioService;
import com.example.demo.event.emailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/hola")
    public ResponseEntity<String> sendEmail(@RequestParam String email){
        applicationEventPublisher.publishEvent(new emailEvent(email));
        return ResponseEntity.ok("Hola mudno!");
    }

}
