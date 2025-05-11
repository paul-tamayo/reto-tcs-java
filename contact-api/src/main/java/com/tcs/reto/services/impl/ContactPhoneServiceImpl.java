package com.tcs.reto.services.impl;

import org.springframework.stereotype.Service;

import com.tcs.reto.repositories.ContactPhoneRepository;
import com.tcs.reto.services.ContactPhoneService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactPhoneServiceImpl implements ContactPhoneService {

	private final ContactPhoneRepository repository;
}
