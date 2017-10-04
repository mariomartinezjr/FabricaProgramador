package Lista16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
	
	public static void imprimirDadosArquivo(String nome) throws LeitorException {
		
		System.out.printf("\nConte�do do arquivo texto:\n\n");
		
		//colocar try Catch aqui
		try {
		FileReader arq = new FileReader(nome);
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		while (linha != null) {
		System.out.printf("%s\n", linha);
		linha = lerArq.readLine();
		}
		arq.close();
		//fim do try cath
		} catch (FileNotFoundException fnfe ) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			throw new LeitorException(ioe);
		}
		
		System.out.println();

}
}