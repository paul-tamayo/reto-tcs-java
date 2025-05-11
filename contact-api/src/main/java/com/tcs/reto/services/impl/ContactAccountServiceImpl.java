package com.tcs.reto.services.impl;

import org.springframework.stereotype.Service;

import com.tcs.reto.repositories.ContactAccountRepository;
import com.tcs.reto.services.ContactAccountService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactAccountServiceImpl implements ContactAccountService {

	private final ContactAccountRepository repository;
}
