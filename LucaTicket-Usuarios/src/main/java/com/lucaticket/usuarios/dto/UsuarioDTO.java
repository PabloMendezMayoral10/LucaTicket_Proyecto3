package com.lucaticket.usuarios.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class UsuarioDTO{
	private int id;
	private String nombre;
	private String apellido; 
	private String email;
	private String password;
	//private Date fechaalta;
	//private List<Evento> eventos;
}
