package br.com.fabricadeprogramador.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class lerArquivo {

	
	public static int c=0;
	public String a;
	public static void  main(String[] args) {
	try {
		BufferedReader lerArquivo = new BufferedReader(new FileReader("C:/Users/Mario/Desktop/concurso.txt"));
	    while (lerArquivo.ready()) {
		String linha = lerArquivo.readLine();
		
		if (linha.toLowerCase().contains("contabilidade".toLowerCase()) &&(linha.toLowerCase().contains("negro".toLowerCase()))) {
		c++;
		}
		
	}
	    System.out.println("numero de inscritos: " + c);
	lerArquivo.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
