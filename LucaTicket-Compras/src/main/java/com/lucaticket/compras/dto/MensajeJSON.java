package com.lucaticket.compras.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor @RequiredArgsConstructor
public class MensajeJSON {

	private int codigo;
	private String mensaje;
}
