package com.tcs.reto.services.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tcs.reto.dto.ContactDto;
import com.tcs.reto.entities.ContactAccount;
import com.tcs.reto.repositories.ContactAccountRepository;

@ExtendWith(MockitoExtension.class)
class ContactAccountServiceImplTest {

	@InjectMocks
	private ContactAccountServiceImpl contactAccountService;

	@Mock
	private ContactAccountRepository repository;

	@Test
	void testDelete() {
		Long pk = 1L;
		lenient().when(repository.findById(pk)).thenReturn(java.util.Optional.of(ContactAccount.builder().build()));

		contactAccountService.delete(pk);

		assertNotNull(contactAccountService);
	}

	@Test
	void testFindAll() {
		when(repository.findAll()).thenReturn(List.of(ContactAccount.builder().build()));

		List<ContactDto> result = contactAccountService.findAll();

		assertNotNull(result);
		assertFalse(result.isEmpty());
	}

	@Test
	void testUpdate() {
		when(repository.updateNumber(any(), any())).thenReturn(1);

		contactAccountService.update(123l, "2005698715");

		assertNotNull(contactAccountService);
	}
}
