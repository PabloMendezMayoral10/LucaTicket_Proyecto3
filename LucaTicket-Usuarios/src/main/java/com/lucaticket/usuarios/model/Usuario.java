package com.lucaticket.usuarios.model;

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

@Entity
	@Table(name = "usuarios")
	@Setter
	@Getter
	//@RequiredArgsConstructor
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String nombre; 
		private String apellido;
		private String email;
		private String password;
		//private Date fechaalta; //Es Date de java.sql, no de java.util - Martin
	}

