package com.example.demo.Reserva.application;

import com.example.demo.Reserva.domain.reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Reserva.domain.reservaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class reservaController {
    @Autowired
    reservaService reservaService;

    @GetMapping
    public List<reserva> findAll() {
        return reservaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<reserva> findById(@PathVariable Long id) {
        return reservaService.findById(id);
    }

    @PostMapping
    public reserva save(@RequestBody reserva reserva) {
        return reservaService.save(reserva);
    }

    @PutMapping("/{id}")
    public reserva update(@PathVariable Long id, @RequestBody reserva reserva) {
        reserva.setId(id);
        return reservaService.save(reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        reservaService.deleteById(id);
    }
}
