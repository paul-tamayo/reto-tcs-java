package com.tcs.reto.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContactAccount {
	
	private int pk;

	private String numero;

	private String nombre;

	private String banco;
	
	private boolean removed;

}
