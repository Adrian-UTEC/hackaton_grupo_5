package com.example.demo.Salon.domain;

import com.example.demo.Salon.infrastructure.salonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class salonService {
    @Autowired
    private salonRepository salonRepository;

    public Optional<salon> findById(Integer id) {
        return salonRepository.findById(id);
    }

    public salon save(salon salon) {
        return salonRepository.save(salon);
    }

    public salon updateSalon(Integer id, salon salonDetails) {
        Optional<salon> optionalSalon = salonRepository.findById(id);
        if (optionalSalon.isPresent()) {
            salon salon = optionalSalon.get();
            salon.setNombre(salonDetails.getNombre());
            salon.setUbicacion(salonDetails.getUbicacion());
            salon.setCapacidad(salonDetails.getCapacidad());
            salon.setDescripcion(salonDetails.getDescripcion());
            return salonRepository.save(salon);
        } else {
            return null;
        }
    }



}
