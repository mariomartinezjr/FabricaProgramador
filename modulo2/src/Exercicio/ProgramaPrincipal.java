package Exercicio;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		SistemaCadastro sistema = new SistemaCadastro();
		
		Cidade cidade = new Cidade();
		
		Pessoa f = new Funcionario();
		Pessoa pf = new PessoaFisica();
		Pessoa p = new Pessoa();
		Pessoa cli = new Cliente();
		Pessoa fo = new Fornecedor();
		
		
		f.setNome("Mario");
		((Funcionario) f).setCargo("dba");
		((Funcionario) f).setCpf("123");
		((Funcionario) f).setRg("90909090");
		((Funcionario) f).setSalario(1200.00);
		
		pf.setNome("Coxão");
		((PessoaFisica) pf).setCpf("11111");
		((PessoaFisica) pf).setRg("2222222");
		
		p.setNome("jao");
		
		cidade.setNome("Camnpo Grande");
		cli.setCidade(cidade);
		cli.setNome("pablo");
		((Cliente)cli).setCpf("33333");
		((Cliente)cli).setRg("99998888");
		
		fo.setNome("gut-gut");
		((Fornecedor)fo).setProduto("refrigerante");
		((Fornecedor)fo).setCnpj("77777");
		((Fornecedor)fo).setRazaoSocial("Distribuidora centro oeste");
	
		sistema.cadastrar(f);
		sistema.cadastrar(pf);
		sistema.cadastrar(p);
		sistema.cadastrar(cli);
		sistema.cadastrar(fo);
		
		sistema.imprimir();
		
		//Instanciar e adicionar os objetos no array do sistema
		
		//Chamar o método imprimir
		
	}

}