package services;
import java.util.ArrayList;

import model.Juego;
/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.1
 * 09-11-2022
 */

public class CSV {
	data.CSV csvDataManager;
	
	public CSV() {
		csvDataManager=new data.CSV();
	}
	
	public ArrayList<Juego>  cargaInicialdeDatos() {
		return csvDataManager.buildGameCollectionFromCSVFile("vgsales.csv");
	}
}
