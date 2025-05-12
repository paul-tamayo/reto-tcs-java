package com.tcs.reto.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.tcs.reto.entities.ContactAccount;

@Component
public class ContactAccountRepository {

	private static final List<ContactAccount> CONTACT_ACCOUNTS;

	static {
		ContactAccount c1 = ContactAccount.builder().pk(1).banco("Banco 1").nombre("Cliente 1").numero("1002365897")
				.build();
		ContactAccount c2 = ContactAccount.builder().pk(2).banco("Banco 2").nombre("Cliente 2").numero("2002365897")
				.build();
		ContactAccount c3 = ContactAccount.builder().pk(3).banco("Banco 3").nombre("Cliente 3").numero("3002365897")
				.build();
		ContactAccount c4 = ContactAccount.builder().pk(4).banco("Banco 4").nombre("Cliente 4").numero("4002365897")
				.build();

		CONTACT_ACCOUNTS = List.of(c1, c2, c3, c4);
	}

	public void delete(int pk) {
		Optional<ContactAccount> account = CONTACT_ACCOUNTS.stream().filter(c -> !c.isRemoved() && c.getPk() == pk)
				.findFirst();

		if (account.isPresent()) {
			account.get().setRemoved(true);
		}
	}

	public List<ContactAccount> findAll() {
		return CONTACT_ACCOUNTS.stream().filter(c -> !c.isRemoved()).toList();
	}

	public ContactAccount update(int pk, String numero) {
		ContactAccount account = null;
		Optional<ContactAccount> accountOptional = CONTACT_ACCOUNTS.stream()
				.filter(c -> !c.isRemoved() && c.getPk() == pk).findFirst();

		if (accountOptional.isPresent()) {
			account = accountOptional.get();
			account.setNumero(numero);
		}

		return account;
	}
}
