public class Fatorial{
	
	public static int CalcularFatorial(int n){
		
		if (n == 0){
			return 1;
	}else {
		return n * (CalcularFatorial(n -1));
	}
	}
}