package com.tcs.reto.services;

import java.util.List;

import com.tcs.reto.entities.ContactAccount;

public interface ContactAccountService {

	void delete(Long pk);

	List<ContactAccount> findAll();

	int update(Long pk, String numero);
}
