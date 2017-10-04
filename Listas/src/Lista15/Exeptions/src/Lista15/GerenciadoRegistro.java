package Lista15.Exeptions.src.Lista15;

public interface GerenciadoRegistro <T>{
	
public void salvar(T Obj);
public void excluir(T Obj);
public T pesquisar(T Obj);
public void imprimirTodos ();
}
