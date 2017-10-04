package Lista9;

public class Conta {

	private Integer numero;
	private Agencia agencia;
	private Correntista correntista;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Correntista getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	

	@Override
	public String toString() {
		return "Conta [Numero=" + getNumero() + ", Agencia=" + getAgencia().getNome() + ", Correntista="
				+ getCorrentista().getNome() + ", Rua=" + getAgencia().getLogradouro().getRua() + ", Cidade=" +
				getAgencia().getLogradouro().getCidade().getNome()+ ", Estado="+ getAgencia().getLogradouro().getCidade().getEstado().getNome() 
				+ ", UF="+ getAgencia().getLogradouro().getCidade().getEstado().getUf() +"]";
	}
	public void imprimeDados() {
	System.out.println("Correntista: " + this.getCorrentista().getNome() + " Banco: " + this.getAgencia().getBanco().getNome() + 
			" Desc Agencia: " + this.getAgencia().getNome() +  " Rua: " + this.getAgencia().getLogradouro().getRua() +
			" cidade: " + this.getAgencia().getLogradouro().getCidade().getNome() +  " Estado: " + this.getAgencia().getLogradouro().getCidade().getEstado().getNome() 
			+ " EStado : " + this.getAgencia().getLogradouro().getCidade().getEstado().getUf());
	
	}
}
