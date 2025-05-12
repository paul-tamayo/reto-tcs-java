package com.tcs.reto.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.reto.entities.ContactAccount;
import com.tcs.reto.repositories.ContactAccountRepository;
import com.tcs.reto.services.ContactAccountService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactAccountServiceImpl implements ContactAccountService {

	private final ContactAccountRepository repository;

	@Override
	public void delete(int pk) {
		repository.delete(pk);
	}

	@Override
	public List<ContactAccount> findAll() {
		return repository.findAll();
	}

	@Override
	public ContactAccount update(int pk, String numero) {
		return repository.update(pk, numero);
	}
}
