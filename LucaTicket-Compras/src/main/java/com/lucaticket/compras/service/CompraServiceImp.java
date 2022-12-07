package com.lucaticket.compras.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucaticket.compras.adapter.CompraAdapter;
import com.lucaticket.compras.controller.EventoNotFoundException;
import com.lucaticket.compras.controller.UsuarioNotFoundException;
import com.lucaticket.compras.dto.CompraDTO;
import com.lucaticket.compras.dto.EventoDTO;
import com.lucaticket.compras.dto.UsuarioDTO;
import com.lucaticket.compras.feigns.ComprasFeingEventos;
import com.lucaticket.compras.feigns.ComprasFeingUsuarios;
import com.lucaticket.compras.model.Compra;
import com.lucaticket.compras.repository.CompraRepository;

/**
 * 
 * @author Álvaro Blanco
 * @apiNote 
 *
 */

public class CompraServiceImp implements CompraService {
	@Autowired
	private CompraRepository cr;
	@Autowired
	private CompraAdapter ca;
	@Autowired
	private ComprasFeingEventos fEventos;
	@Autowired
	private ComprasFeingUsuarios fUsuarios;

	@Override
	public CompraDTO realizarCompra(int idUsu, String idEve) {
		Compra c = new Compra();
		
		UsuarioDTO usuario = fUsuarios.getUsuarioById(idUsu);
		if(usuario!=null) c.setId_usuario(idUsu);
		else throw new UsuarioNotFoundException();
		
		EventoDTO evento = fEventos.getEventById(idEve);
		if(evento!=null) c.setId_evento(idEve);
		else throw new EventoNotFoundException();
		
		return ca.convertToDTO(cr.save(c));
	}



}
