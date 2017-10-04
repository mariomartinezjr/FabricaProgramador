package Lista4;

public class Funcionario {

	Double maiorsalario=0d;
	Double menorsalario=99999999999999d;
	Double mediasalario=0d;
	Double acima1000=0d;
	Double abaixo1000=0d;
	int contador=0;
	
  public void  calcularSalario(Double salario){
	
		
	if (salario > maiorsalario)	{
		maiorsalario = salario;
	}
	if(salario < menorsalario || salario ==0){
		menorsalario=salario;
	}
	if (salario > 1000){
		acima1000++ ;
		
	}
	if (salario < 1000){
		abaixo1000++ ;
	}
	mediasalario = (mediasalario + salario);
		
	}	
  
  public void imprimir(){
	  
	    System.out.println("Maior Salario: " + maiorsalario); 
		System.out.println("Menor Salario: " + menorsalario); 
		System.out.println("Percentual Salario acima de 1000: " + (acima1000/contador) * 100);
		System.out.println("Percentual Salario abaixo de 1000: " + (abaixo1000/contador) *100);
		System.out.println("Media Salarios: " + mediasalario);
	  
  }
	
}
