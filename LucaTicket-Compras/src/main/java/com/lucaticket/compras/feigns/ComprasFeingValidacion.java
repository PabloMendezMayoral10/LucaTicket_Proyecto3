package com.lucaticket.compras.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucaticket.compras.dto.MensajeJSON;

@FeignClient(name = "validacion", url = "http://localhost:5555")
public interface ComprasFeingValidacion {
	@GetMapping("/validaciones/")
	public MensajeJSON validar();
}
