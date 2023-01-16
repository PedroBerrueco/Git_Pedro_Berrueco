package pedroberruecound1;

/**
 * Ejercicio 7, consiste en operar con variables de tipo Byte.
 * 
 * @author Pedro Berrueco
 *
 */

public class E7operaritme {

	public static void main(String[] args) {
		// declramos las variables de tipo byte.
		byte num1 = 127;
		byte num2 = 127;
		// declaramos las variables de tipo entero para poder operar con ellas.
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multi = num1 * num2;
		int divi = num1 / num2;

		System.out.println("127 + 127 = " + suma);
		System.out.println("127 - 127 = " + resta);
		System.out.println("127 * 127 = " + multi);
		System.out.println("127 / 127 = " + divi);
	}

}
