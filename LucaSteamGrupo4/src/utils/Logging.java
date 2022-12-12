package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Logging / Utilidades par logear la informacion del programador
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */
public class Logging {
	public static void Log(String infoToLog) {
		try {
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("Log.txt"));
			bufferedwriter.write("[LOG] "+infoToLog + "\n");
			bufferedwriter.close();
			
		} catch(IOException ex) {
			System.out.println("IOException");
		}
		
		
	}
}
