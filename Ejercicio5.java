package javanoprogramador;

import java.util.Scanner;

public class Ejercicio5 {

	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de sueldos a analizar: ");
	        int N = scanner.nextInt();

	        if (N > 0) {
	            double sumaSueldos = 0;
	            double sueldoMaximo = Double.MIN_VALUE; // Inicializar con el valor mínimo posible
	            double sueldoMinimo = Double.MAX_VALUE; // Inicializar con el valor máximo posible

	            for (int i = 1; i <= N; i++) {
	                System.out.print("Ingrese el sueldo #" + i + ": ");
	                double sueldo = scanner.nextDouble();

	                // Actualizar el sueldo máximo y mínimo
	                if (sueldo > sueldoMaximo) {
	                    sueldoMaximo = sueldo;
	                }
	                if (sueldo < sueldoMinimo) {
	                    sueldoMinimo = sueldo;
	                }

	                sumaSueldos += sueldo;
	            }

	            double promedio = sumaSueldos / N;

	            System.out.println("Sueldo más alto: " + sueldoMaximo);
	            System.out.println("Sueldo más bajo: " + sueldoMinimo);
	            System.out.println("Promedio de sueldos: " + promedio);
	        } else {
	            System.out.println("Ingrese un valor válido para N (mayor que 0).");
	        }

	        scanner.close();
	    }
	}
	
	

