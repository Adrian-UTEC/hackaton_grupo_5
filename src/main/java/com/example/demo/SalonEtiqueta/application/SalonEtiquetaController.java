package com.example.demo.SalonEtiqueta.application;
import com.example.demo.SalonEtiqueta.domain.SalonEtiqueta;
import com.example.demo.SalonEtiqueta.infrastructure.SalonEtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salonEtiquetas")
public class SalonEtiquetaController {
    @Autowired
    private SalonEtiquetaRepository salonEtiquetaRepository;

    @GetMapping
    public List<SalonEtiqueta> getAllSalonEtiquetas() {
        return salonEtiquetaRepository.findAll();
    }

    @GetMapping("/{id}")
    public SalonEtiqueta getSalonEtiquetaById(@PathVariable Integer id) {
        return salonEtiquetaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public SalonEtiqueta createSalonEtiqueta(@RequestBody SalonEtiqueta salonEtiqueta) {
        return salonEtiquetaRepository.save(salonEtiqueta);
    }

    @DeleteMapping("/{id}")
    public void deleteSalonEtiqueta(@PathVariable Integer id) {
        salonEtiquetaRepository.deleteById(id);
    }
}