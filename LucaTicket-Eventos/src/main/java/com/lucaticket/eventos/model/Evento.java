package com.lucaticket.eventos.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

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
	
	@NotEmpty(message = "El nombre no debe ser vacío")
	@NotNull
	@Field("nombre")
	private String nombre;
	
	@Field("descripcioncorta")
	@NotEmpty(message = "Debe de haber una descripcion corta")
	@NotNull
	private String descripcioncorta;
	
	@NotEmpty(message = "Debe de haber una descripcion larga")
	@NotNull
	@Field("descripcionlarga")
	private String descripcionlarga;
	
	@NotEmpty(message = "Debe de haber una ruta de la foto")
	@NotNull
	@Field("rutafoto")
	private String rutafoto;
	
	@NotEmpty(message = "Debe de haber una precio minimo")
	@NotNull
	@Field("preciominimo")
	@Min(value = 100)
	@Positive
	private int preciominimo;
	
	
	@NotEmpty(message = "Debe de haber una precio maximo")
	@NotNull
	@Field("preciomaximo")
	@Max(value = 500)
	@Positive
	private int preciomaximo;
	
	@NotEmpty(message = "Debe de haber unas normas")
	@NotNull
	@Field("normas")
	private String normas;
	
	@NotEmpty(message = "Debe de haber un nombre de recinto")
	@NotNull
	@Field("nombrerecinto")
	private String nombrerecinto;
	
	@NotEmpty(message = "Debe de haber una ciudad en el campo")
	@NotNull
	@Field("ciudad")
	private String ciudad;
	
	@NotEmpty(message = "Debe de haber una direccion en el campo")
	@NotNull
	@Field("direccion")
	private String direccion;
	
	@NotEmpty(message = "Debe de haber un tipo de recinto")
	@NotNull
	@Field("tiporecinto")
	private String tiporecinto;
	
	@NotEmpty(message = "Debe de haber un numero de aforo en el campo")
	@NotNull
	@Field("aforo")
	@Positive
	@Max(value = 2000)
	private int aforo;

	
}


