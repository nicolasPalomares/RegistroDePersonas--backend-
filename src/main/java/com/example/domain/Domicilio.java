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
@Table(name = "domicilio")
public class Domicilio {
	
	@Id
	@Column(name = "id_domicilio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String calle;
	
	@Column(name = "nro_calle")
	private Long nroCalle;
	
	private String localidad;

}
