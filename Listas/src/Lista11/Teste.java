package Lista11;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		GerenciadorMatricula g = new GerenciadorMatricula();
		Cidade ci1 = new Cidade();
		Cidade ci2 = new Cidade();
		 ci1.setNome("Cuiaba");
		 ci2.setNome("Cuiaba");
		 
		Aluno  al1 = new Aluno();
		Aluno  al2 = new Aluno();
		
		al1.setNome("mario");
		al1.setCpf("123");
		
		al2.setNome("mario");
		al2.setCpf("12");
		
		
		 
		System.out.println("digite a quantidade de matriculas:");
		int qtd = entrada.nextInt();
		g.setQtd(qtd);
		
		for(int i=0;i < g.getQdt(); i++) {
			
			Aluno a = new Aluno();
			Curso c = new Curso();
			Matricula m = new Matricula();
			Cidade ci = new Cidade();
			
			
			System.out.println("Digite o codigo do aluno");
			a.setCodigo(entrada.nextInt());
			
			System.out.println("Digite o nome do aluno");
			a.setNome(entrada.next());
			
			System.out.println("Digite o cpf do aluno");
			a.setCpf(entrada.next());
			
			System.out.println("Digite o Codigo do Curso");
			c.setCodigoCurso(entrada.nextInt());
			
			System.out.println("Digite o nome do Curso");
			c.setNome(entrada.next());
			
			System.out.println("Digite a Carga Horaria do Curso");
			c.setCargaHoraria(entrada.nextInt());
			
			System.out.println("Digite a Cidade do Aluno");
			ci.setNome(entrada.next());
			
			m.setAluno(a);
			m.setCurso(c);
			
			g.cadastrarMatricula(m);
			
		}
		
		//g.imprime();
		
		
		
//		Integer busca= 0;
//		System.out.println("digite o codigo de busca:");
//		busca = entrada.nextInt();
		
	    Curso busca = new Curso();
		busca.setCodigoCurso(22);
		busca.setNome("java");
		busca.setCargaHoraria(12);
		
		//Aluno busca = new Aluno();
		//busca.setNome("mario");
		//busca.setCpf("123");
		//busca.setCodigo(10);
		
		
		//g.buscarMatricula(busca);
		
		Matricula matresp[] = g.buscarMatricula(busca);
		for (int i=0; i < matresp.length;i++) {
			if(matresp[i] == null) {
				break;
			}
			//System.out.println("Codigo: " +  matresp[i].getAluno().getCodigo() + " Nome: " + matresp[i].getAluno().getNome() + " Curso: "  + matresp[i].getCurso().getNome());	
			System.out.println("Codigo: " +  matresp[i].getCurso().getCodigoCurso() + " Nome: " + matresp[i].getCurso().getNome() + " Curso: "  + matresp[i].getCurso().getCargaHoraria());
		}
		
		//g.toString();
		
		//System.out.println(ci1.equals(ci2));
		//System.out.println(al1.equals(al2));
		
	}
	

}
