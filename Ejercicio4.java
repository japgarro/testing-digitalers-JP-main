package javanoprogramador;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número de 3 dígitos: ");
	        int numero = scanner.nextInt();

	        if (numero >= 100 && numero <= 999) {
	            System.out.println("Valores pares desde 0 hasta " + numero + ":");
	            for (int i = 0; i <= numero; i += 2) {
	                System.out.println(i);
	            }
	        } else {
	            System.out.println("El número ingresado no tiene 3 dígitos.");
	        }

	        scanner.close();
	    }
	}

	
	
	

