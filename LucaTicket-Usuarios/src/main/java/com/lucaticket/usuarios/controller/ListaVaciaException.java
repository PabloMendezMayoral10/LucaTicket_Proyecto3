package com.lucaticket.usuarios.controller;

public class ListaVaciaException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ListaVaciaException() {
		super("HHHAAAA");
	}
	
	public ListaVaciaException(int id) {
		super("HHHaaaa" +id);
	}
}
