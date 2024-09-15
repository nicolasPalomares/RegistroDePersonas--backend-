package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "persona")
public class Persona {
	
	@Id
	@Column(name = "id_persona")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	@Column(name = "fecha_de_nacimiento")
	private String fechaDeNacimiento;
	
	private String email;

}
