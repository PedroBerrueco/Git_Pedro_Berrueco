package pedroberruecound1;

/**
 * Ejercicio 5, consiste en realizar una división con decimales desde dos
 * números enteros.
 * 
 * @author Pedro Berrueco
 *
 */

public class E5divideci {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 2;
		
		//Utilizamos conversión de tipo cast para forzar al resultado a mostrar decimales.
		System.out.println("n1= " +n1);
		System.out.println("n2= " +n2);
		System.out.println("n1/n2 = " +(double)n1/(double)n2);
	}
}