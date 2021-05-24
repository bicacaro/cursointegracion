package es.gobcan.ece.integracion1;


public class Menu {

	public static void main(String[] args) {
		int elem1=100;
		int elem2=12;
		Prueba19052021.suma(1,2);
		Operaciones.resta(elem1, elem2);
		Operaciones.multiplicacion(elem1, elem2);
		Operaciones.division(elem1, elem2);
		System.out.println("La suma es " + Prueba19052021.suma(elem1, elem2));
		System.out.println("La resta es " + Operaciones.resta(elem1, elem2););
		System.out.println("La multiplicación es " + Operaciones.multiplicacion(elem1, elem2));
		System.out.println("La división es " + Operaciones.division(elem1, elem2);
	}

}
