package com.example.demo.SalonEtiqueta.domain;

import com.example.demo.Etiqueta.domain.Etiqueta;
import com.example.demo.Salon.domain.salon;
import jakarta.persistence.*;

public class SalonEtiqueta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idSalon")
    private salon salon;

    @ManyToOne
    @JoinColumn(name = "idEtiqueta")
    private Etiqueta etiqueta;


}
