package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.dao.DomicilioDao;
import com.example.domain.Domicilio;

@Service
public class DomicilioService implements iService<Domicilio> {
	
	@Autowired
	private DomicilioDao domicilioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Domicilio> listEntity() {
		return (List<Domicilio>) domicilioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Domicilio findEntity(Domicilio domicilio) {
		return domicilioDao.findById(domicilio.getId()).orElse(null);
	}

	@Override
	@Transactional
	public void saveEntity(Domicilio domicilio) {
		domicilioDao.save(domicilio);
	}

	@Override
	@Transactional
	public void deleteEntity(Domicilio domicilio) {
		domicilioDao.delete(domicilio);
	}

	// Sin uso para el objeto Domicilio
	@Override
	public Domicilio findByDni(String dni) {
		return null;
	}

}
