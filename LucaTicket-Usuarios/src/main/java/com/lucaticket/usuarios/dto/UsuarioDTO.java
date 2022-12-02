package com.lucaticket.usuarios.dto;

import java.io.Serializable;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
public class UsuarioDTO implements Serializable{

	private int id;
	private String username, password, email;
	//private List<Evento> eventos;
}
