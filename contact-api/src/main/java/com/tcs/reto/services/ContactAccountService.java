package com.tcs.reto.services;

import java.util.List;

import com.tcs.reto.entities.ContactAccount;

public interface ContactAccountService {

	void delete(int pk);

	List<ContactAccount> findAll();

	ContactAccount update(int pk, String numero);
}
