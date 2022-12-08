package unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import model.Juego;
import model.Plataformas;
import utils.Logging;
import data.ColeccionJuegos;


/**
 * Junit / Pruebas unitarias 
 * @author  Daniel y Martin
 * @version 1.2
 * 10-11-2022
 */

public class Junit {
	
	static {
		try {
			
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}
	
	@BeforeAll
	public static void beforeAll() {
		
	}
	
	@BeforeEach
	public void beforeEach() {
		
	}
	
	public static void afterAll() {
		
	}
	
	public void afterEach() {
		
	}
	
	@Disabled
	//Ni idea de que hace esto, pero estaba en el ejercicio que he fusilado
	public void executionIgnored() {
		Logging.Log("");
	}
	
	@Test
	public void testingCantidadDeJuegosEnCSV() {
		final int cantidadEsperada = 16598; //aunque el rank vaya de 1 a 16600, hay dos que faltan de por medio
		
		data.CSV csv = new data.CSV();
		ArrayList<Juego> listaJuegosCargadosDeCSV = csv.buildGameCollectionFromCSVFile("vgsales.csv");
		
		
		assertEquals(cantidadEsperada, listaJuegosCargadosDeCSV.size());
	}
	
	@Test
	public void testingPrimerElementoDelCSV() {
		data.CSV csv = new data.CSV();
		ArrayList<Juego> listaJuegosCargadosDeCSV = csv.buildGameCollectionFromCSVFile("vgsales.csv");
		
		assertEquals(listaJuegosCargadosDeCSV.get(0).getAnnosalida(), 2006);
	}
	
	
	public boolean correccion(String ruta) {
		try {
			new Juego(ruta);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public void incluir(ColeccionJuegos c,Juego j){
		try{
			System.out.println(c);
		}catch(Exception e){
			System.out.println("Se ha producido un error.");
		}
	}
}
