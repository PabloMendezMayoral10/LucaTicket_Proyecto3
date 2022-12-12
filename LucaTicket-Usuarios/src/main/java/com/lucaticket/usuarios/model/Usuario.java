package com.lucaticket.usuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * Usuario
 * @author martin
 * @since 12-12-2022
 * @apiNote Entidad Usuario con los valores validados
 */
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
		@NotNull
		@NotEmpty(message="El usuario debe tener un nombre")
		private String nombre; 
		@NotNull
		@NotEmpty(message="El usuario debe tener un apellido")
		private String apellido;
		@NotNull
		@NotEmpty(message="El usuario debe tener un email")
		@Email(message="email no valido")
		private String email;
		@NotNull
		@NotEmpty(message="El usuario debe tener un password")
		private String password;
		//private Date fechaalta; //Es Date de java.sql, no de java.util - Martin
	}

