package com.example.demo.SalonEtiqueta.infrastructure;

import com.example.demo.SalonEtiqueta.domain.SalonEtiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonEtiquetaRepository extends JpaRepository<SalonEtiqueta, Integer> {
}
