//Comenzamos poniendo la sentencia package para respetar las convecciones del código.
package pedroberruecound1;

/**
 * Ejercicio 1, consiste en solicitar el nombre al usuario y mostrarle un saludo personalizado.
 * 
 * @author Pedro Berrueco
 *
 */

//Importamos la clase scanner para poder usarla como variable posteriormente.
import java.util.Scanner;

public class E1saludo {

	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		//Solicitamos el nombre al usuario.
		System.out.println("Indica tu nombre: ");
		
		//declaramos la varibale nombre de tipo string cuyo valor sea el que se haya introducido por teclado.
		String nombre = teclado.next();
		
		//Mostramos al usuario un saluso seguido de el valor de la variable nombre.
		System.out.println("Hola " + nombre);

	}

}
