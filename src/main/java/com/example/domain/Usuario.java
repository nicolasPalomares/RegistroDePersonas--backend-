package com.example.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
	
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Rol> roles;

}
