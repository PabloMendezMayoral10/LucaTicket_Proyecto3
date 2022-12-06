package com.lucaticket.validacion.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @RequiredArgsConstructor
public class ValidacionDTO implements Serializable{
	private int idUsuario;
	private int idEventos;
}
