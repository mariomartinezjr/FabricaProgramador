package Lista3;

public class FiguraGeometrica {

	public String identificarTriangulo(double l1 , double l2 , double l3){
		
		double tri = 0;
		
		if (l1 == l2 && l2 ==l3 ){
			return "Triangulo equilatero";
		}else if (l1 !=l2 && l2 != l3 ){
			return "Triangulo Escaleno";
		}else {
			return "triangulo isoceles";
		}
		
	}
}
