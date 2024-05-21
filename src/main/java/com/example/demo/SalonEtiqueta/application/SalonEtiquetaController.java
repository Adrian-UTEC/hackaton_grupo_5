package com.example.demo.SalonEtiqueta.application;
import com.example.demo.SalonEtiqueta.domain.SalonEtiqueta;
import com.example.demo.SalonEtiqueta.domain.SalonEtiquetaService;
import com.example.demo.SalonEtiqueta.infrastructure.SalonEtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salonEtiquetas")
public class SalonEtiquetaController {

    @Autowired
    private SalonEtiquetaService salonEtiquetaService;

    @GetMapping
    public ResponseEntity<List<SalonEtiqueta>> getAllSalonEtiquetas() {
        List<SalonEtiqueta> salonEtiquetas = salonEtiquetaService.getAllSalonEtiquetas();
        return ResponseEntity.ok(salonEtiquetas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalonEtiqueta> getSalonEtiquetaById(@PathVariable Integer id) {
        SalonEtiqueta salonEtiqueta = salonEtiquetaService.getSalonEtiquetaById(id);
        if (salonEtiqueta != null) {
            return ResponseEntity.ok(salonEtiqueta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SalonEtiqueta> createSalonEtiqueta(@RequestBody SalonEtiqueta salonEtiqueta) {
        SalonEtiqueta createdSalonEtiqueta = salonEtiquetaService.createSalonEtiqueta(salonEtiqueta);
        return new ResponseEntity<>(createdSalonEtiqueta, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalonEtiqueta(@PathVariable Integer id) {
        salonEtiquetaService.deleteSalonEtiqueta(id);
        return ResponseEntity.noContent().build();
    }

}