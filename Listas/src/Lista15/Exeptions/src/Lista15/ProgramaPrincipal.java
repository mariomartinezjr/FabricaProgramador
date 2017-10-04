package Lista15.Exeptions.src.Lista15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int opcao=0;
		
		GerenciadorRegistrosGenerico grn = new GerenciadorRegistrosGenerico();
		GerenciadorRegistroCliente grc = new GerenciadorRegistroCliente();
		
		
		
		while(opcao != 9) { 
			
			Cliente cli1 = new Cliente();
			Cidade cidade1 = new Cidade();	
		
		System.out.println("Digite a opeção:");
		System.out.println("1 - Salvar um novo registro");
		System.out.println("2 - Excluir um registro por nome");
		System.out.println("3 - Imprimir Todos os Homens Cadastrados");
		System.out.println("4 - Imprimir Todas as Mulheres cadastradas");
		System.out.println("5 - Buscar um Cliente pelo seu ID");
		System.out.println("6 - Imprimir todos");
		System.out.println("SAIR DIGITE 9");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			
		
			System.out.println("Digite o id do cliente");
			cli1.setId(entrada.nextInt());
			System.out.println("Digite o Nome do cliente");
			cli1.setNome(entrada.next());
			System.out.println("Digite o Sexo do cliente");
			cli1.setSexo(entrada.next().charAt(0));
			System.out.println("Digite a cidade do cliente");
			cidade1.setNome(entrada.next());
			cli1.setCidade(cidade1);
			grn.salvar(cli1);
			break;
		
		case 2 :
			Cliente removerCli = new Cliente();
			
			System.out.println("Digite o nome do cliente");
			cli1.setNome(entrada.next()) ;
			grn.excluir(cli1);
			break;
		
		case 3 :
			
			ArrayList<Cliente> result = new ArrayList<Cliente>();
			result = grc.getListaHomens();
			
			for (Iterator iterator = result.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
			    System.out.println(result);
			}
			System.out.println("------------------------------------------------------------------------");
			break;
		
		case 4 :
			
			result = grc.getListaMulher();
			
			for (Iterator iterator = result.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
				System.out.println(result);
			}
			System.out.println("------------------------------------------------------------------------");
			break;
		 
		 
		case 5 :
			
			System.out.println("Digite o id do cliente de busca");
			Cliente cliBusca = new Cliente();
			int i =0;
			
			i = entrada.nextInt();
			cliBusca.setId(i);
			
			System.out.println(grn.pesquisar(cliBusca));
			System.out.println("------------------------------------------------------------------------");
			break;
			
		case 6 :
			
			
			grn.imprimirTodos();
			System.out.println("------------------------------------------------------------------------");
			break;
			
			case 7 :
				System.out.println(grn.clientes.size());
		}				
		
			
				
		}
		
		
		//	result = grc.getLista(cidade2);
		
		//for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			//Cliente cliente = (Cliente) iterator.next();
			//System.out.println(result);
		//}
		
		
		
		entrada.close();

	}
	
}
