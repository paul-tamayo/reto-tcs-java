package com.tcs.reto.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.tcs.reto.entities.ContactPhone;

@Component
public class ContactPhoneRepository {

	private static final List<ContactPhone> CONTACT_PHONES;

	static {
		ContactPhone p1 = ContactPhone.builder().nombreDelBanco("Banco 1").nombrePropietario("Cliente 1")
				.numeroCelular("0996365541").numeroCuenta("100254718").build();
		ContactPhone p2 = ContactPhone.builder().nombreDelBanco("Banco 2").nombrePropietario("Cliente 2")
				.numeroCelular("0996365542").numeroCuenta("103254788").build();
		ContactPhone p3 = ContactPhone.builder().nombreDelBanco("Banco 3").nombrePropietario("Cliente 3")
				.numeroCelular("0996365543").numeroCuenta("100554788").build();
		ContactPhone p4 = ContactPhone.builder().nombreDelBanco("Banco 4").nombrePropietario("Cliente 4")
				.numeroCelular("0996365544").numeroCuenta("100252288").build();

		CONTACT_PHONES = List.of(p1, p2, p3, p4);
	}

	public List<ContactPhone> findAll() {
		return CONTACT_PHONES.stream().filter(p -> !p.isRemoved()).toList();
	}

	public void delete(String phoneNumber) {
		Optional<ContactPhone> account = CONTACT_PHONES.stream()
				.filter(c -> !c.isRemoved() && c.getNumeroCelular().compareTo(phoneNumber) == 0).findFirst();

		if (account.isPresent()) {
			account.get().setRemoved(true);
		}
	}

	public boolean exist(String phoneNumber) {
		return !CONTACT_PHONES.stream().filter(p -> p.getNumeroCelular().compareTo(phoneNumber) == 0).toList()
				.isEmpty();
	}
}
