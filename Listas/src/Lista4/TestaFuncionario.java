package Lista4;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t=0;
		//int contador=0;
		
		Funcionario f = new Funcionario();
		Scanner entrada = new Scanner(System.in);
		do {
			
		System.out.println("digite um salario:");
		Double	salario = entrada.nextDouble();
		
		f.calcularSalario(salario);
		
		System.out.println("Deseja continuar? 1 = sim , 2 = não");
	      t = entrada.nextInt();
		
	      f.contador++;
	      
	      
	}while (t ==1);
		
		f.imprimir();
		
		entrada.close();
	}
	
	}

