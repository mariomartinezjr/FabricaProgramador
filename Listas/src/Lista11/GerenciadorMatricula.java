package Lista11;

import java.util.Arrays;

public class GerenciadorMatricula {
	
	private Matricula matricula[]; 
	private Integer codigoSeq=1;
	private Integer pos=0;
	
	
	
	public void cadastrarMatricula(Matricula mat) {
		
		Integer novoCodigo = gerarCodigoSequencial();
		mat.setCodigo(novoCodigo);
		
		if(pos < matricula.length) {
			matricula[pos++]=mat;
		}
		
	}
	
	public Matricula[] buscarMatricula(Integer codigo) {
		Matricula matRes[] = new Matricula[getQdt()];
		int j=0;
		
		for(int i=0;i< getQdt();i++) {
			if (codigo ==  matricula[i].getAluno().getCodigo()) {
				matRes[j] =matricula[i];
			}
		}
		
		return matRes;
	}
	
	public  Matricula[] buscarMatricula(Aluno aluno) {
		Matricula matRes[] = new Matricula[getQdt()];
		int j=0;
		
		for(int i=0;i< getQdt();i++) {
			if (aluno.equals(matricula[j].getAluno())) {
				matRes[j] =matricula[i];
				break;
			}
		}
		
		return matRes;
	}
	
	
	public Matricula[] buscarMatricula(Curso aluno) {
		Matricula matRes[] = new Matricula[getQdt()];
		int j=0;
		
		for(int i=0;i< getQdt();i++) {
			if (aluno.equals(matricula[i].getCurso())) {
				matRes[j] =matricula[i];
				break;
			}
		}
		
		return matRes;
	}
	
	public Matricula[] getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula[] matricula) {
		this.matricula = matricula;
	}
	
	private Integer gerarCodigoSequencial() {
		
		
		return codigoSeq++;
	}
	
public void imprime() {
		
		for (int i=0; i < matricula.length; i++) {
			System.out.println("Codigo: " +  matricula[i].getCodigo() + " Nome: " + matricula[i].getAluno().getNome() + " Curso: "  + matricula[i].getCurso().getNome());
		} 
		
		

}


@Override
public String toString() {
	for (int i=0; i < matricula.length; i++) {
	System.out.println("GerenciadorMatricula [matricula=" + Arrays.toString(matricula) + "]");
}
	return null;
}

public void setQtd(int qtd) {
	
	matricula = new Matricula[qtd] ;
	
}
public int getQdt() {
	// TODO Auto-generated method stub
	return matricula.length;
}

public String verificaIgualdade(Cidade ci1 , Cidade c2) {
	if(this.equals(c2)) {
		return "Cidade Igual";
	}else
		return "Cidade diferente";
}
}
