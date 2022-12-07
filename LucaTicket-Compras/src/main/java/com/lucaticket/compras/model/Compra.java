package com.lucaticket.compras.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author Álvaro Blanco
 * @apiNote Estos son los atributos principales para pasar dto
 *
 */
@Entity
@Table(name = "compra")
@Setter
@Getter
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_compra;
	private int id_usuario;
	private String id_evento;

}
