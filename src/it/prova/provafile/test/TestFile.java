package it.prova.provafile.test;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestFile {

	public static void main(String[] args) {
		String percorso = "C:\\\\Prova\\testLetturaScrittura.txt";
		/*
		 * try { File fileProvaSeEsiste = new File(percorso);
		 * 
		 * if(fileProvaSeEsiste.exists()) System.out.println("Primo Successo"); else
		 * if(fileProvaSeEsiste.createNewFile()) System.out.println("File creato"); else
		 * System.out.println("Errore"); }catch(IOException e) { e.printStackTrace(); }
		 */
		try {
			File fileProvaScrittura = new File(percorso);
			FileWriter fw = new FileWriter(fileProvaScrittura);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("prova prova scrittura numero 1");
			bw.write("Prova prova scrittura numero 2 ma con bufferedWriter");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Prova lettura su file
		/*
		 * char[] in = new char[50]; int size = 0; try {
		 * 
		 * File fileLettura = new File(percorso); FileReader fr = new
		 * FileReader(fileLettura); size = fr.read(in);
		 * System.out.println("Nel file sono presenti " +size + "caratteri");
		 * System.out.println("Il file presente queste parole: ");
		 * 
		 * for(int i = 0; i<size; i++) { System.out.println(in[i]); fr.close(); }
		 * 
		 * }catch(IOException e) { e.printStackTrace(); }
		 */
	}

}
