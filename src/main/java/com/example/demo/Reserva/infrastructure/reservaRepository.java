package com.example.demo.Reserva.infrastructure;

import com.example.demo.Reserva.domain.reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reservaRepository extends JpaRepository<reserva, Long> {

}
