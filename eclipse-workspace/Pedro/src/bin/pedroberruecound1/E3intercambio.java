package pedroberruecound1;

/**
 * Ejercicio 3, Crear dos variables y mostrar su valor , para despues
 * intercambiar sus valores.
 * 
 * 
 * @author Pedro Berrueco
 *
 */

public class E3intercambio {

	public static void main(String[] args) {
		// Declaramos 3 variables num1, num2 y una auxiliar sin valor asignado.
		int num1 = 5;
		int num2 = 8;
		int numA;

		// Mostramos el primer mensaje sin intercambio.
		System.out.println("num1= " + num1 + " y num2= " + num2);

		// Cremos las instrucciones para hacer el intercambio Utilizando la variable
		// auxiliar.

		numA = num1;
		num1 = num2;
		num2 = numA;

		System.out.println("num1= " + num1 + " y num2= " + num2);

	}

}
