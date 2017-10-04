package Lista9;

import java.util.Calendar;
import java.util.Date;

public class TestaLocadora {

	public static void main(String[] args) {
	
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		Cliente cli3 = new Cliente();
		
		cli1.setNome("mario");
		cli1.setCpf("12345");
		
		cli2.setNome("marcio");
		cli2.setCpf("65443");
		
		cli3.setNome("marcos");
		cli3.setCpf("196532");
		
		Atendente at1 =new Atendente();
		
		at1.setNome("jao");
		at1.setCpf("98766");
		
		Genero ge1 = new Genero();
		Genero ge2 = new Genero();
		Genero ge3 = new Genero();
		
		ge1.setDescricao("terror");
		ge2.setDescricao("ficção");
		ge3.setDescricao("comedia");
		
		Autor aut1 = new Autor();
		Autor aut2 = new Autor();
		Autor aut3 = new Autor();
		
		aut1.setAutor("hit cok");
		aut2.setAutor("geroge lucas");
		aut3.setAutor("mark ron");
		
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		Filme f3 = new Filme();
		
		f1.setAutor(aut1);
		f1.setGenero(ge1);
		f1.setNome("psicose");
		
		f2.setAutor(aut2);
		f2.setGenero(ge2);
		f2.setNome("star wars");
		
		f3.setAutor(aut3);
		f3.setGenero(ge3);
		f3.setNome("as branquelas");
		
		Locacao loc1 = new Locacao();
		Locacao loc2 = new Locacao();
		Locacao loc3 = new Locacao();
		
		Date dl = new Date();
		Calendar de = Calendar.getInstance();
		de.add(Calendar.DATE, +3);
		
		loc1.setAtendente(at1);
		loc1.setCliente(cli1);
		loc1.setFilme(f1);
	    loc1.setDataLocacao(dl);
	    
		
		loc2.setAtendente(at1);
		loc2.setCliente(cli2);
		loc2.setFilme(f2);
		loc2.setDataLocacao(dl);
		
		
		loc3.setAtendente(at1);
		loc3.setCliente(cli3);
		loc3.setFilme(f3);
		loc3.setDataLocacao(dl);
		loc3.setDataLocacao(dl);
		
		
		System.out.println("nome :" + loc1.getCliente().getNome() +  " Data locacao " + loc1.getDataLocacao() +  "  Cpf: " + loc1.getCliente().getCpf() +  " Filme:" +  loc1.getFilme().getNome() + " Autor: " +  loc1.getFilme().getAutor().getAutor() + " Atendente: " + loc1.getAtendente().getNome()      );
		System.out.println("nome :" + loc2.getCliente().getNome() +  " Data locacao " + loc2.getDataLocacao() + "  Cpf: " + loc2.getCliente().getCpf() +  " Filme:" +  loc2.getFilme().getNome() + " Autor: " +  loc2.getFilme().getAutor().getAutor() + " Atendente: " + loc2.getAtendente().getNome()      );
		System.out.println("nome :" + loc3.getCliente().getNome() +  " Data locacao " + loc3.getDataLocacao() + "  Cpf: " + loc3.getCliente().getCpf() +  " Filme:" +  loc3.getFilme().getNome() + " Autor: " +  loc3.getFilme().getAutor().getAutor() + " Atendente: " + loc3.getAtendente().getNome()      );
	}

}
