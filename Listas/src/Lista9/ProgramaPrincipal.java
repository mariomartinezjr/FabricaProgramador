package Lista9;

import org.omg.Messaging.SyncScopeHelper;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Correntista cor1 = new Correntista();
		Correntista cor2 = new Correntista();
		Correntista cor3 = new Correntista();

		cor1.setNome("Mario");
		cor1.setCpf("88372022100");
		cor1.setCodigo(1);
		
		cor2.setNome("Marcos");
		cor2.setCpf("10928367");
		cor2.setCodigo(2);
		
		cor3.setNome("Marcelo");
		cor3.setCpf("781623");
		cor3.setCodigo(3);
		
		Estado es = new Estado();
		es.setNome("mato grosso do sul");
		es.setUf("ms");
		
		Cidade ci = new Cidade();
		ci.setNome("campo grande");
		ci.setEstado(es);
		
		Logradouro lo = new Logradouro();
		Logradouro lo2 = new Logradouro();
		Logradouro lo3 = new Logradouro();
		
		lo.setBairro("estrela park");
		lo.setCep("798444");
		lo.setRua("tim maia");
		lo.setCidade(ci);
		
		lo2.setBairro("tiradentes");
		lo2.setCep("79876");
		lo2.setRua("oceania");
		lo2.setCidade(ci);
		
		lo3.setBairro("dama");
		lo3.setCep("799543");
		lo3.setRua("marques de pombal");
		lo3.setCidade(ci);
		
		Banco ban = new Banco();
		ban.setCodigo(123);
		ban.setNome("santander");
		
		Agencia ag = new Agencia();
		Agencia ag2 = new Agencia();
		Agencia ag3 = new Agencia();
		
		ag.setBanco(ban);
		ag.setLogradouro(lo);
		ag.setCodigo(1321);
		ag.setNome("agencia ceara");
		ag.setNumero(1098);

		ag2.setBanco(ban);
		ag2.setLogradouro(lo2);
		ag2.setCodigo(7654);
		ag2.setNome("agencia ceara");
		ag2.setNumero(8765);
		
		ag3.setBanco(ban);
		ag3.setLogradouro(lo3);
		ag3.setCodigo(1323);
		ag3.setNome("agencia ceara");
		ag3.setNumero(1097);
		
		
		Conta cc = new Conta();
		Conta cc2 = new Conta();
		Conta cc3 = new Conta();
		
		cc.setAgencia(ag);
		cc.setCorrentista(cor1);
		cc.setNumero(98765);
		
		cc2.setAgencia(ag2);
		cc2.setCorrentista(cor2);
		cc2.setNumero(98766);
		
		cc3.setAgencia(ag3);
		cc3.setCorrentista(cor3);
		cc3.setNumero(98764);
		
		cc.imprimeDados();
		cc2.imprimeDados();
		cc3.imprimeDados();
		
		System.out.println(cc.toString());
		System.out.println(cc2.toString());
		System.out.println(cc3.toString());
				
		
		
	}

}
