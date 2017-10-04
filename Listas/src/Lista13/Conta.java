package Lista13;

import Lista9.Correntista;

public abstract class Conta {
	
	protected double saldo;
	private Correntista correntista;
	
	public abstract void atualizarSaldo();

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
	

}
