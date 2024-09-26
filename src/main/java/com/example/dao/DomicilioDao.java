package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Domicilio;

public interface DomicilioDao extends JpaRepository<Domicilio, Long> {
}
