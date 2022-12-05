package com.lucaticket.usuarios.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre, apellidos, password, email;
	private Date fechaalta;
	//private List<Evento> eventos;
}
