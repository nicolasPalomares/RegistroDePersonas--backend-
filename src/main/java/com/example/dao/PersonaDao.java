package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long> {
	Persona findByDni(String dni);
}
