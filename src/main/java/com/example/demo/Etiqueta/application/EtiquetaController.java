package com.example.demo.Etiqueta.application;
import com.example.demo.Etiqueta.domain.Etiqueta;
import com.example.demo.Etiqueta.infrastructure.EtiquetaRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etiquetas")
public class EtiquetaController {
    @Autowired
    private EtiquetaRepostory etiquetaRepository;

    @GetMapping
    public List<Etiqueta> getAllEtiquetas() {
        return etiquetaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Etiqueta getEtiquetaById(@PathVariable Integer id) {
        return etiquetaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Etiqueta createEtiqueta(@RequestBody Etiqueta etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }

    @PutMapping("/{id}")
    public Etiqueta updateEtiqueta(@PathVariable Integer id, @RequestBody Etiqueta etiquetaDetails) {
        Etiqueta etiqueta = etiquetaRepository.findById(id).orElse(null);
        if (etiqueta != null) {
            etiqueta.setNombre(etiquetaDetails.getNombre());
            return etiquetaRepository.save(etiqueta);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEtiqueta(@PathVariable Integer id) {
        etiquetaRepository.deleteById(id);
    }
}