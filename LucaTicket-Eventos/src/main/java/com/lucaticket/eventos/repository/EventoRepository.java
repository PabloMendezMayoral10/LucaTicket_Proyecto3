package com.lucaticket.eventos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucaticket.eventos.model.Evento;

public interface EventoRepository extends MongoRepository<Evento,String>{

}
