package com.example.demo.Salon.infrastructure;

import com.example.demo.Salon.domain.salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salonRepository extends JpaRepository<salon, Integer> {
}
