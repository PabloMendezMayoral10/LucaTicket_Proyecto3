package control;
import java.util.ArrayList;

import model.Juego;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.1
 * 09-11-2022
 */


public class CSV {
	services.CSV csvServiceManager;
	public CSV() {
		csvServiceManager=new services.CSV();
	}
	public ArrayList<Juego> cargaInicialdeDatos(){
		return csvServiceManager.cargaInicialdeDatos();
	}
	
}
