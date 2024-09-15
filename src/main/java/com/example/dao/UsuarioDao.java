package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	Usuario findByUsername(String username);
}
