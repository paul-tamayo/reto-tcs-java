package com.tcs.reto.services.impl;

import org.springframework.stereotype.Service;

import com.tcs.reto.services.ContactAccountService;
import com.tcs.reto.services.ContactAgrupationService;
import com.tcs.reto.services.ContactPhoneService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactAgrupationServiceImpl implements ContactAgrupationService {

	private final ContactPhoneService contactPhoneService;

	private final ContactAccountService contactAccountService;
}
