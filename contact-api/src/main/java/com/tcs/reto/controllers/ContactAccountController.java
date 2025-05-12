package com.tcs.reto.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.reto.bindings.ApiResponse;
import com.tcs.reto.entities.ContactAccount;
import com.tcs.reto.enums.ContactTypeEnum;
import com.tcs.reto.services.ContactAccountService;

import lombok.RequiredArgsConstructor;

@RequestMapping("contact-account")
@RequiredArgsConstructor
@RestController
public class ContactAccountController {

	private final ContactAccountService service;

	@DeleteMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, value = "{type}/{id}")
	public ApiResponse delete(@PathVariable("type") ContactTypeEnum type, @PathVariable("id") int id) {
		service.delete(id);

		return ApiResponse.builder().code(200).message("Delete Contact").build();
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ApiResponse read() {
		List<ContactAccount> accounts = service.findAll();
		
		return ApiResponse.builder().code(200).message("Get List").data(accounts).build();
	}
}
