package com.lucaticket.validacion.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.lucaticket.validacion.model.Validacion;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @RequiredArgsConstructor
public class ValidacionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private int idEventos;
	
	public static ValidacionDTO of(Validacion validacion) {
		ValidacionDTO validacionResponse = new ValidacionDTO();
		validacionResponse.setIdUsuario(validacion.getIdUsuario());
		validacionResponse.setIdEventos(validacion.getIdEventos());

        return validacionResponse;
    }
	
	public static List<ValidacionDTO> of(List<Validacion> validaciones) {
		return validaciones.stream().map(v -> of(v)).collect(Collectors.toList());
	}
}
