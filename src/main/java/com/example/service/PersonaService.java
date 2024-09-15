package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.dao.PersonaDao;
import com.example.domain.Persona;

@Service
public class PersonaService implements iService<Persona> {
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> listEntity() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findEntity(Persona persona) {
		return personaDao.findById(persona.getId()).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Persona findByDni(String dni) {
		return personaDao.findByDni(dni);
	}

	@Override
	@Transactional
	public void saveEntity(Persona persona) {
		personaDao.save(persona);
	}

	@Override
	@Transactional
	public void deleteEntity(Persona persona) {
		personaDao.delete(persona);
	}

}
