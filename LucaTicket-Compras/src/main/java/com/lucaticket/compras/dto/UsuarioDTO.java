package com.lucaticket.compras.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author ÁLVARO Blanco 
 * @apiNote POJO para devolver eventos sin la información específica de la base de datos
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UsuarioDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
}
