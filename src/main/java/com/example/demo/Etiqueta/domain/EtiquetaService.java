package com.example.demo.Etiqueta.domain;
import java.util.List;

public interface EtiquetaService {
    List<Etiqueta> getAllEtiquetas();
    Etiqueta getEtiquetaById(Integer id);
    Etiqueta createEtiqueta(Etiqueta etiqueta);
    Etiqueta updateEtiqueta(Integer id, Etiqueta etiquetaDetails);
    void deleteEtiqueta(Integer id);
}