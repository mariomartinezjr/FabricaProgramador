package Exercicio;

public class SistemaCadastro {

	Pessoa pessoas[] = new Pessoa[5];
	int numEntradas = 0;
	
	public void cadastrar(Pessoa pessoa) {
		
		if(numEntradas < pessoas.length) {
			pessoas[numEntradas] = pessoa;
			numEntradas++;
		}
	}
	
	public void imprimir() {
		
		for(int i = 0; i < numEntradas; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());
			
			//Verificando se é uma instancia de PessoaFisica
			if(pessoas[i] instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica)pessoas[i]; //Casting
				
				System.out.println("CPF: " + pf.getCpf());
				System.out.println("RG: " + pf.getRg());
			}
			//Verificando se é uma instancia de PessoaJuridica
			if(pessoas[i] instanceof PessoaJuridica) {
				PessoaJuridica pj = (PessoaJuridica)pessoas[i]; //Casting
				
				System.out.println("CNPJ: " + pj.getCnpj());
				System.out.println("Razão Social: " + pj.getRazaoSocial());
			}
			
			//Verificando se é uma instancia de Funcionario
			if(pessoas[i] instanceof Funcionario) {
				Funcionario func = (Funcionario)pessoas[i];
				
				//System.out.println("CPF: " + func.getCpf());
				//System.out.println("RG: " + func.getRg());
				System.out.println("Salário: " + func.getSalario());
				System.out.println("Cargo: " + func.getCargo());
			}
			
			if (pessoas[i] instanceof Cliente) {
				Cliente cli = (Cliente)pessoas[i];
				System.out.println("Cidade: " + cli.getCidade().getNome());
				
			}
			
			if (pessoas[i] instanceof Fornecedor) {
				Fornecedor fo = (Fornecedor)pessoas[i];
				
				System.out.println("Produto: " + fo.getProduto());
				
			}
			
			System.out.println("--------------------------------------------");
			
			//TODO FAZER PARA CLIENTE E FORNECEDOR
		}
		
	}
}
