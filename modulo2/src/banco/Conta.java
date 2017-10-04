package banco;

import modulo2.Cliente;

public class Conta {
	
	Cliente nome;
	int codigoCliente;
	int numero;
	private double saldo;
	int agencia;
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	public void setSaldo(double novoSaldo) {
		
		this.saldo = novoSaldo;
	}
	


	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", codigoCliente=" + codigoCliente + ", numero=" + numero + ", saldo=" + saldo
				+ ", agencia=" + agencia + "]";
	}

	public void depositaConta(double valor) {
		
		this.saldo = saldo + valor;
	}

	public void debitaConta(double valor) {
		
		if (valor <= saldo) {
		this.saldo = saldo - valor;
	}else {
		System.out.println("saldo insuficiente");
	}
	}
}
