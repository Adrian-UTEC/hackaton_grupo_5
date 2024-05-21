package com.example.demo.SalonEtiqueta.domain;

import com.example.demo.SalonEtiqueta.infrastructure.SalonEtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalonEtiquetaService {

    @Autowired
    private SalonEtiquetaRepository salonEtiquetaRepository;

    public List<SalonEtiqueta> getAllSalonEtiquetas() {
        return salonEtiquetaRepository.findAll();
    }

    public SalonEtiqueta getSalonEtiquetaById(Integer id) {
        return salonEtiquetaRepository.findById(id).orElse(null);
    }

    public SalonEtiqueta createSalonEtiqueta(SalonEtiqueta salonEtiqueta) {
        return salonEtiquetaRepository.save(salonEtiqueta);
    }

    public void deleteSalonEtiqueta(Integer id) {
        salonEtiquetaRepository.deleteById(id);
    }

}