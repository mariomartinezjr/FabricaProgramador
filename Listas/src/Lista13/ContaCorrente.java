package Lista13;

import Lista9.Correntista;

public class ContaCorrente extends Conta{

	final static double JUROS_CONTA_CORRENTE=0.10;
	
	public ContaCorrente() {
		
	}
	
public ContaCorrente(double saldo, Correntista correntista) {
	super();
	this.setSaldo(saldo);
	this.setCorrentista(correntista);
	}
	

	@Override
	public void atualizarSaldo() {
		
		this.saldo = saldo - (saldo *JUROS_CONTA_CORRENTE);
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + ", Correntista=" + getCorrentista() + "]";
	}



	

}
