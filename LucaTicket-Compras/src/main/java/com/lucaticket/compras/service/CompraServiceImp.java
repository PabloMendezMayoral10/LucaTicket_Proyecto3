package com.lucaticket.compras.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucaticket.compras.adapter.CompraAdapter;
import com.lucaticket.compras.dto.CompraDTO;
import com.lucaticket.compras.model.Compra;
import com.lucaticket.compras.repository.CompraRepository;

public class CompraServiceImp implements CompraService {
	@Autowired
	private CompraRepository cr;

	@Override
	public CompraDTO realizarCompra(int idUsu, String idEve) {
		Compra c = new Compra();
		
		c.setId_usuario(idUsu);
		c.setId_evento(idEve);
		
		CompraAdapter ca = new CompraAdapter();
		
		return ca.convertToDTO(cr.save(c));
	}

}
