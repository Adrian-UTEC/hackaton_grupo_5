package com.example.demo.SalonEtiqueta.domain;

import java.util.List;

public interface SalonEtiquetaService {
    List<SalonEtiqueta> getAllSalonEtiquetas();
    SalonEtiqueta getSalonEtiquetaById(Integer id);
    SalonEtiqueta createSalonEtiqueta(SalonEtiqueta salonEtiqueta);
    void deleteSalonEtiqueta(Integer id);
}