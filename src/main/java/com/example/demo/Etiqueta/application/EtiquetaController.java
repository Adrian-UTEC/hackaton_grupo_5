package com.example.demo.Etiqueta.application;

import com.example.demo.Etiqueta.domain.Etiqueta;
import com.example.demo.Etiqueta.domain.EtiquetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etiquetas")
public class EtiquetaController {
    @Autowired
    EtiquetaService etiquetaService;

    @GetMapping
    public List<Etiqueta> getAllEtiquetas() {
        return etiquetaService.getAllEtiquetas();
    }

    @GetMapping("/{id}")
    public Etiqueta getEtiquetaById(@PathVariable Integer id) {
        return etiquetaService.getEtiquetaById(id);
    }

    @PostMapping
    public Etiqueta createEtiqueta(@RequestBody Etiqueta etiqueta) {
        return etiquetaService.createEtiqueta(etiqueta);
    }

    @PutMapping("/{id}")
    public Etiqueta updateEtiqueta(@PathVariable Integer id, @RequestBody Etiqueta etiquetaDetails) {
        return etiquetaService.updateEtiqueta(id, etiquetaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEtiqueta(@PathVariable Integer id) {
        etiquetaService.deleteEtiqueta(id);
    }
}
