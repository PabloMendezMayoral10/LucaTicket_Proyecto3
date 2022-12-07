package com.lucaticket.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucaticket.compras.adapter.CompraAdapter;
import com.lucaticket.compras.dto.CompraDTO;
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
	
	@Override
	public CompraDTO getEventById(int id) {
		final Compra compra = cr.findById(id).orElseThrow();
		return ca.convertToDTO(compra);
	}

	@Override
	public List<CompraDTO> getUsurioById(int id) {
		return cr.findByIdUser(id);
	}



}
