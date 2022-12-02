package com.lucaticket.usuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
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
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username, password, email;
	// private List<Evento> eventos;

}
