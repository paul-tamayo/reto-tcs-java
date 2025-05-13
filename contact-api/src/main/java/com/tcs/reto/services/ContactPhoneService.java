package com.tcs.reto.services;

import java.util.List;

import com.tcs.reto.entities.ContactPhone;

public interface ContactPhoneService {

	List<ContactPhone> findAll();

	void delete(String phoneNumber);

	int updateNumber(String numeroCelular, String newNumero);
}
