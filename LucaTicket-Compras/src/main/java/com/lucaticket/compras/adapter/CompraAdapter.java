package com.lucaticket.compras.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.lucaticket.compras.dto.CompraDTO;
import com.lucaticket.compras.model.Compra;

/**
 * CompraAdapter
 * @author Martin
 * @since 06-12-2022
 * Clase que transforma Compra en su version DTO
 */
@Component
public class CompraAdapter {
	
	/**
	 * convertToDTO
	 * @author Martin
	 * @param compra a convertir
	 * @return la misma compra pero en DTO
	 * @since 06-12-2022
	 */
	public CompraDTO convertToDTO( Compra c ) {
		CompraDTO dto = new CompraDTO();
		
		dto.setId_compra(c.getId_compra());
		dto.setId_usuario(c.getId_usuario());
		dto.setId_evento(c.getId_evento());
		
		return dto;
	}
	
	/**
	 * convertToDTO
	 * @author Martin
	 * @param lista de compras a convertir
	 * @return una lista con todas las compras transformadas a DTO
	 * @since 06-12-2022
	 */
	public List<CompraDTO> convertToDTO( List<Compra> compras ) {
		ArrayList<CompraDTO> dtos = new ArrayList<CompraDTO>();
		for(Compra c : compras) {
			dtos.add( convertToDTO(c) );
		}
		return dtos;
	}
}
