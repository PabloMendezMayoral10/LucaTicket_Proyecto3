package com.lucaticket.usuarios.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Ioan Stirbu
 * @version 1.0 date: 02/12/2022
 *
 * @apiNote Clase Usuario, con sus respectivos atributos
 */

@Entity
@Table(name = "usuarios")
@Setter
@Getter
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre, apellidos, password, email;
	private Date fechaalta; //Es Date de java.sql, no de java.util - Martin
	// private List<Evento> eventos;


}
