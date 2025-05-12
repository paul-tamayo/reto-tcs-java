package com.tcs.reto.services;

import java.util.List;

import com.tcs.reto.entities.ContactAccount;

public interface ContactAccountService {

	List<ContactAccount> findAll();
	
	void delete(int pk);
}
