package com.lucaticket.compras.service;

import com.lucaticket.compras.dto.CompraDTO;

public interface CompraService {
	public CompraDTO realizarCompra(int idUsu, String idEve);
}
