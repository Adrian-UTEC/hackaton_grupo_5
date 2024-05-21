package com.example.demo.Etiqueta.domain;

import com.example.demo.Etiqueta.infrastructure.EtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtiquetaService {
    @Autowired
    EtiquetaRepository etiquetaRepository;

    public List<Etiqueta> getAllEtiquetas() {
        return etiquetaRepository.findAll();
    }

    public Etiqueta getEtiquetaById(Integer id) {
        Optional<Etiqueta> optionalEtiqueta = etiquetaRepository.findById(id);
        return optionalEtiqueta.orElse(null);
    }

    public Etiqueta createEtiqueta(Etiqueta etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }

    public Etiqueta updateEtiqueta(Integer id, Etiqueta etiquetaDetails) {
        Optional<Etiqueta> optionalEtiqueta = etiquetaRepository.findById(id);
        if (optionalEtiqueta.isPresent()) {
            Etiqueta etiqueta = optionalEtiqueta.get();
            etiqueta.setNombre(etiquetaDetails.getNombre());
            return etiquetaRepository.save(etiqueta);
        }
        return null;
    }

    public void deleteEtiqueta(Integer id) {
        etiquetaRepository.deleteById(id);
    }
}
