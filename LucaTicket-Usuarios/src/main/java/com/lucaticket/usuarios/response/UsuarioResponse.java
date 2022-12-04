package com.lucaticket.usuarios.response;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author Pedro
 * @author Alvaro
 * @apiNote Clase UsuarioReponse trabaja de DTO
 */
@Setter
@Getter
@NoArgsConstructor
public class UsuarioResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private String email;
}
