package com.lucaticket.compras.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* CompraDTO
* @author Martin
* POJO que se utiliza para ser devuelto sin incluir cosas de Bases de Datos
* 06-12-2022
*/

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class CompraDTO{
	private int id_compra;
	private int id_usuario;
	private String id_evento;
}
