package pedroberruecound1;

/**
 * Ejercicio 9, Pedir un número al usuario y mostrarle su tabla de multiplicar.
 * 
 * @author Pedro Berrueco
 *
 */

//He probado que importando todas las librerias también toma la  utilidad Scanner.
import java.util.Scanner;

public class E9tablamulti {

	public static void main(String[] args) {
		// Creamos la clase teclado para tomar del Scanner.
		Scanner teclado = new Scanner(System.in);

		// Creamos una variable de tipo entero que usaremos para operar.
		int multiplico;

		// Pido el número al usuario,
		System.out.print("Introduce un numero [1-10]:");

		// Asocio el valor introducido por teclado a la variable de tipo entero.
		multiplico = teclado.nextInt();

		System.out.println(multiplico + " x 1 = " + multiplico * 1);
		System.out.println(multiplico + " x 2 = " + multiplico * 2);
		System.out.println(multiplico + " x 3 = " + multiplico * 3);
		System.out.println(multiplico + " x 4 = " + multiplico * 4);
		System.out.println(multiplico + " x 5 = " + multiplico * 5);
		System.out.println(multiplico + " x 6 = " + multiplico * 6);
		System.out.println(multiplico + " x 7 = " + multiplico * 7);
		System.out.println(multiplico + " x 8 = " + multiplico * 8);
		System.out.println(multiplico + " x 9 = " + multiplico * 9);
		System.out.println(multiplico + " x 10 = " + multiplico * 10);
	}

}
