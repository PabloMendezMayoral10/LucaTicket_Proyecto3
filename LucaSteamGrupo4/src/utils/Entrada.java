package utils;

import java.util.Scanner;

/**
 * Entrada / Metodos estaticos de entrada
 * @author  Ivan
 * @version 1.0
 * 09-11-2022
 */

public class Entrada {
	
	
	public static int entradaInt() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		return opcion;
	}
	
	public static String entradaString() {
		String opcion;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextLine();
		return opcion;
	}
	
	


}
