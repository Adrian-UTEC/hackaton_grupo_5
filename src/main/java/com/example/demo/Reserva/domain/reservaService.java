package com.example.demo.Reserva.domain;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Reserva.infrastructure.reservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class reservaService {
    @Autowired
    reservaRepository reservaRepository;

    public List<reserva> findAll() {
        return reservaRepository.findAll();
    }

    public Optional<reserva> findById(Long id) {
        return reservaRepository.findById(id);
    }

    public reserva save(reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void deleteById(Long id) {
        reservaRepository.deleteById(id);
    }
}
