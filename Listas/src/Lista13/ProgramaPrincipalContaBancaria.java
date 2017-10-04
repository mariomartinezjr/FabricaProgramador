package Lista13;

import Lista9.Correntista;

public class ProgramaPrincipalContaBancaria {

			public static void main(String[] args) {
			
			// Entrada no construtor de Conta Poupanca - ( Saldo e Correntista)
			
			Conta contaPoupanca = new ContaPoupanca(5000.0, new Correntista(1,"Zé", "999.999.999-99"));
			
			// Atualiza Saldo com rendimento de 1% base a do numa constante
			
			contaPoupanca.atualizarSaldo();
			
			//deve imprimir 1.0
			
			System.out.println(ContaPoupanca.PERC_RENDIMENTO_CONTA_POUPANCA);
			
			//deve imprimir dados do correntista e novo saldo
			
			System.out.println(contaPoupanca);
			// Entrada no construtor de Conta Corrente - ( Saldo e Correntista)
			
			Conta contaCorrente = new ContaCorrente(6000.0, new Correntista(2, "Jão", "888.888.888-99"));
			
			// Atualiza Saldo descontando 10% de juros deu uso de limite
			
			contaCorrente.atualizarSaldo();
			
			//deve imprimir 10.0
			
			System.out.println(ContaCorrente.JUROS_CONTA_CORRENTE);
			
			//deve imprimir dados do correntista e novo saldo
			
			System.out.println(contaCorrente);
			
		}

	}


