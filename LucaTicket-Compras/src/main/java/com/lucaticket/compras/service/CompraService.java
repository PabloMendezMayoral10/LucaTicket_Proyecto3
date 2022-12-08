package com.lucaticket.compras.service;

import java.util.List;

import com.lucaticket.compras.controller.mensajes.NoValidadoException;
import com.lucaticket.compras.dto.CompraDTO;
/**
 * 
 * @author Álvaro Blanco
 * @apiNote Son los métodos preparados para implementar.
 *
 */
public interface CompraService {
	//public CompraDTO getEventById(int id);
	
	//public List<CompraDTO> getUsurioById(int id);
	
	public CompraDTO realizarCompra(int idUsu, String idEve) throws NoValidadoException;

}
