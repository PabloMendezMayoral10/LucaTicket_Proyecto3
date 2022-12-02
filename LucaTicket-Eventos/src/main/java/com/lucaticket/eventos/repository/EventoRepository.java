package com.lucaticket.eventos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucaticket.eventos.model.Evento;

/**
 * EventoRepository
 * @author Martin
 * Interfaz para comunicar la aplicacion con la base de datos MongoDB
 * 02-12-2022
 */
@Repository
public interface EventoRepository extends MongoRepository<Evento, String>{

}
