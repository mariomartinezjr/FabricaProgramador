
public class Algoritimo4 {

	public static void main(String[] args) {
		
		float cfv;
		float cv;
		float salario=1500.0f;
		float qtd =6.0f;
		float vendas=6000.0f;
		
		cfv= qtd * 50;
		cv = vendas * 0.05f;
		salario=salario + cfv+cv;
		
		System.out.println(cfv);
		System.out.println(cv);
		System.out.println(salario);

	}

}
