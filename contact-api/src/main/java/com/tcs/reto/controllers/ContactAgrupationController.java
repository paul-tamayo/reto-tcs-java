package com.tcs.reto.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.reto.actions.ApiResponse;
import com.tcs.reto.services.ContactAgrupationService;

import lombok.RequiredArgsConstructor;

@RequestMapping("contact")
@RequiredArgsConstructor
@RestController
public class ContactAgrupationController {

	private final ContactAgrupationService service;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ApiResponse getAll() {
		return ApiResponse.builder().code(200).message("Get List").build();
	}
}
