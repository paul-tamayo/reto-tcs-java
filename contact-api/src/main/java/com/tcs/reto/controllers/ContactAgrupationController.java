package com.tcs.reto.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.reto.bindings.ApiResponse;
import com.tcs.reto.bindings.ContactEntry;
import com.tcs.reto.enums.ContactTypeEnum;
import com.tcs.reto.services.ContactAgrupationService;

import lombok.RequiredArgsConstructor;

@RequestMapping("contact")
@RequiredArgsConstructor
@RestController
public class ContactAgrupationController {

	private final ContactAgrupationService service;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ApiResponse create(@RequestParam("type") ContactTypeEnum type, @RequestBody ContactEntry contact) {
		return ApiResponse.builder().code(201).message("Create Contact").build();
	}

	@DeleteMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, value = "{type}/{id}")
	public ApiResponse delete(@PathVariable("type") ContactTypeEnum type, @PathVariable("id") String id) {
		return ApiResponse.builder().code(200).message("Delete Contact").build();
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ApiResponse read() {
		return ApiResponse.builder().code(200).message("Get List").build();
	}
}
