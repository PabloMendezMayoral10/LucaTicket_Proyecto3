package com.lucaticket.eventos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
@Document(collection = "Eventos")
public class Evento {
	@Id
	private String id;
	@Field("nombre")
	private String nombre;
	@Field("descripcioncorta")
	private String descripcioncorta;
	@Field("descripcionlarga")
	private String descripcionlarga;
	@Field("rutafoto")
	private String rutafoto;
	@Field("preciominimo")
	private int preciominimo;
	@Field("preciomaximo")
	private int preciomaximo;
	@Field("normas")
	private String normas;
	@Field("nombrerecinto")
	private String nombrerecinto;
	@Field("ciudad")
	private String ciudad;
	@Field("direccion")
	private String direccion;
	@Field("tiporecinto")
	private String tiporecinto;
	@Field("aforo")
	private int aforo;
}
