package com.tcs.reto.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContactPhone {
	
	private String clave;

	private String numeroCelular;

	private String numeroCuenta;

	private String nombrePropietario;

	private String nombreDelBanco;
	
	private boolean removed;
}
