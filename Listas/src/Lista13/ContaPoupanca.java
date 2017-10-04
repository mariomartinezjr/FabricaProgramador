package Lista13;

import Lista9.Correntista;

public class ContaPoupanca extends Conta {

	final static double  PERC_RENDIMENTO_CONTA_POUPANCA=0.01;
	
	public ContaPoupanca() {
		
	}
	
public ContaPoupanca(double saldo, Correntista correntista) {
	super();
	this.setSaldo(saldo);
	this.setCorrentista(correntista);
	}
	
		
	@Override
	public void atualizarSaldo() {
		
		this.saldo = saldo + (saldo * PERC_RENDIMENTO_CONTA_POUPANCA);
		
	}

	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + ", Correntista=" + getCorrentista() + "]";
	}
	
	

}
