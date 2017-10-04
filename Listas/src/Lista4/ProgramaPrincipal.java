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

		System.out.println("M�dia de Homens"+ cl.mediaHomem);
		System.out.println("M�dia de Mulher"+ cl.mediaMulher);
		System.out.println("M�dia do Grupo " + cl.calcularIdadeMediaGrupo(cl.mediaHomem , cl.mediaMulher));
		leitor.close();

	}
}
