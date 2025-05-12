package com.tcs.reto.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContactPhone {

	private String clave;

	private String nombreDelBanco;

	private String nombrePropietario;

	private String numeroCelular;

	private String numeroCuenta;

	private boolean removed;
}
