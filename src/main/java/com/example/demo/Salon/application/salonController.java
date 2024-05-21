package com.example.demo.Salon.application;

import com.example.demo.Salon.domain.salon;
import com.example.demo.Salon.domain.salonService;
import com.example.demo.Salon.infrastructure.salonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/salon")
public class salonController {
    @Autowired
    private salonService service;

    @GetMapping
    public List<salon> getAllSalones() {
        return salonRepository.findAll();
    }

    @GetMapping("/{id}")
    public salon getSalonById(@PathVariable Integer id) {
        return salonRepository.findById(id).orElse(null);
    }

    @PostMapping
    public salon createSalon(@RequestBody salon salon) {
        return salonRepository.save(salon);
    }


    @DeleteMapping("/{id}")
    public void deleteSalon(@PathVariable Integer id) {
        salonRepository.deleteById(id);
    }
}
