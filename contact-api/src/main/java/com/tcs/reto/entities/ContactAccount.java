package com.tcs.reto.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContactAccount {

	private String banco;

	private String nombre;

	private String numero;

	private int pk;

	private boolean removed;

}
