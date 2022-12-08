package com.lucaticket.compras.controller.mensajes;

/**
 * NoValidadoException
 * @author martin
 * @apiNote se lanza cuando no se valida correctamente una compra
 * @since 08-12-2022
 */
public class NoValidadoException extends Exception{
	private static final long serialVersionUID = 1L;
	public NoValidadoException(String mensaje) {
		super(mensaje);
	}
}
