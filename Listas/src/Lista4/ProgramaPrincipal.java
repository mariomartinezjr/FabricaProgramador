package Lista4;

import java.util.Scanner;


public class ProgramaPrincipal {

	public static void main(String[] args) {

		ClubeLazer cl = new ClubeLazer();
		Scanner leitor = new Scanner(System.in);

		for (int i=0; i<3; i++){

			System.out.println("Idade Homem:");
			int idadeHomem = leitor.nextInt();

			System.out.println("Idade Mulher:");
			int idadeMulher = leitor.nextInt();
			
			cl.calcularIdadeMediaHomens(idadeHomem);
			cl.calcularIdadeMediaMulheres(idadeMulher);

		}

		System.out.println("Média de Homens"+ cl.mediaHomem);
		System.out.println("Média de Mulher"+ cl.mediaMulher);
		System.out.println("Média do Grupo " + cl.calcularIdadeMediaGrupo(cl.mediaHomem , cl.mediaMulher));
		leitor.close();

	}
}
