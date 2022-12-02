package com.lucaticket.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaticket.usuarios.repository.UsuarioRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/usuario")
/**
 * 
 * @author Álvaro Blanco
 *
 */
public class UsuarioController {
	 private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	 @Autowired
	 private UsuarioRepository repo;
	 
}
