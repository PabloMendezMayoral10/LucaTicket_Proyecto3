package com.lucaticket.compras.controller;
/**
 *UsuarioNotFoundException
 * @author Martin
 * @since 07-12-2022
 * Se lanza cuando no se encuentra un usuario
 */
public class UsuarioNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public UsuarioNotFoundException(){
		super("Usuario no encontrado");
	}
	
	public UsuarioNotFoundException(int id) {
		super("Usuario con id "+id+" no encontrado");
	}
}
