package com.lucaticket.eventos.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Evento
 * @author Martin
 * Clase que gestiona los eventos de la base de datos (Mongo)
 * 02-12-2022
 */

@Setter @Getter @ToString @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class Evento {
	private int id;
	private String nombre;
	private String descripcionCorta;
	private String descripcionLarga;
	private String rutaFoto;
	private int precioMinimo;
	private int precioMaximo;
	private String normas;
	private String nombreRecinto;
	private String ciudad;
	private String direccion;
	private String tipoRecinto;
	private int aforo;
}
