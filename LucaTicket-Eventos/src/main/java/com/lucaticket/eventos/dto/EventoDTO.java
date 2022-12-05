package com.lucaticket.eventos.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * EventoDTO
 * @author Martin
 * POJO para devolver eventos sin la información específica de la base de datos
 * 02-12-2022
 */
@Setter @Getter @ToString @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class EventoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private String descripcioncorta;
	private String descripcionlarga;
	private String rutafoto;
	private int preciominimo;
	private int preciomaximo;
	private String normas;
	private String nombrerecinto;
	private String ciudad;
	private String direccion;
	private String tiporecinto;
	private int aforo;
}
