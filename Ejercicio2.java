package javanoprogramador;

import java.util.Scanner;
public class Ejercicio2 {

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número entre 0 y 9,999: ");
	        int numero = scanner.nextInt();

	        if (numero >= 0 && numero <= 9999) {
	            int cifras = contarCifras(numero);
	            System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
	        } else {
	            System.out.println("El número ingresado no pertenece al rango solicitado.");
	        }

	        scanner.close();
	    }

	    public static int contarCifras(int numero) {
	        if (numero == 0) {
	            return 1; // El número 0 tiene una cifra.
	        } else {
	            int cifras = 0;
	            while (numero > 0) {
	                numero /= 10;
	                cifras++;
	            }
	            return cifras;
	        }
	    }
	
}
