package com.tcs.reto.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.reto.entities.ContactPhone;
import com.tcs.reto.repositories.ContactPhoneRepository;
import com.tcs.reto.services.ContactPhoneService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class ContactPhoneServiceImpl implements ContactPhoneService {

	private final ContactPhoneRepository repository;

	@Override
	public List<ContactPhone> findAll() {
		log.info("Listando todos los contactos");
		
		List<ContactPhone> list = List.of();

		try {
			list = repository.findAll();
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}

		return list;
	}

	@Override
	public void delete(String clave) {
		log.info("Eliminando el la clave: {}", clave);
		
		boolean flag = repository.existsById(clave);

		if (flag) {
			repository.deleteById(clave);
		} else {
			log.error("El número ingresado no existe");
			
			throw new RuntimeException("El número ingresado no existe");
		}
	}
}
