package Lista15.Exeptions.src.Lista15;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorRegistroCliente extends GerenciadorRegistrosGenerico{
		
	public ArrayList<Cliente> getListaHomens(){
		
		ArrayList<Cliente> listaH = new ArrayList<Cliente>();
				
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
		Cliente cliente = (Cliente) iterator.next();
		  if(cliente.getSexo() =='M') {
		    listaH.add(cliente);
		   
		   }
		}
		
		return listaH;
	}
	
	public ArrayList<Cliente> getListaMulher(){
		
		ArrayList<Cliente> listaM = new ArrayList<Cliente>();
				
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
		    if(cliente.getSexo() =='F') {
		    	
		    	listaM.add(cliente);
		    }
		}
		
		return listaM;
		
	}

	public ArrayList<Cliente> getLista(Cidade cidade){
		
		ArrayList<Cliente> listaC = new ArrayList<Cliente>();
				
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
		    if(cliente.getCidade().equals(cidade)) {
		    	
		    	listaC.add(cliente);
		    }
		}
		
		return listaC;
	}	
}
