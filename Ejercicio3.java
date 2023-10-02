package javanoprogramador;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[5];

	        // solicita al ususario que ingrese cinco numeros
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Ingrese el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // p/ordenar de < a >
	        Arrays.sort(numeros); // 
	        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));

	        // p/ordenar de > a <
	        int[] numerosDescendentes = new int[5];
	        for (int i = 0; i < 5; i++) {
	            numerosDescendentes[i] = numeros[4 - i];
	        }
	        System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(numerosDescendentes));

	        scanner.close();
	    }
	

	
	
}
