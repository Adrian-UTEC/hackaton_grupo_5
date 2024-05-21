package com.example.demo.Salon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSalon;
    private String nombre;
    private String ubicacion;
    private Integer capacidad;
    private String descripcion;

}
