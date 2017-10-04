package Lista15.Exeptions.src.Lista15;

import java.util.ArrayList;
import java.util.Iterator;


public class GerenciadorRegistrosGenerico implements GerenciadoRegistro<Cliente> {

	protected  ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public void salvar(Cliente cliAdd) {
		clientes.add(cliAdd);
		
	}

	@Override
	public void excluir(Cliente cliRemover) {
		
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if(cliente.getNome().equals(cliRemover.getNome())) {
				clientes.remove(cliente);
				
			}
		}
		
	}

	@Override
	public Cliente pesquisar(Cliente cliBuscar) {
		
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if (cliBuscar.getId().equals(cliente.getId())) {
				
				return cliente;
				
			}
		}
		
		return null;
	}

	@Override
	public void imprimirTodos() {
		
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			System.out.println(cliente);
		}  
			
		
		
	}

	
	public ArrayList<Cliente> retornaCliArray(){
	
		return this.clientes;
	}
	
}
