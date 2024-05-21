package com.example.demo.Etiqueta.infrastructure;

import com.example.demo.Etiqueta.domain.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {
}
