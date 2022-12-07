package com.lucaticket.compras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaticket.compras.dto.CompraDTO;
import com.lucaticket.compras.model.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer>{
	
	List<CompraDTO> findByIdUser(int id);
}
