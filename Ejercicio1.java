package javanoprogramador;
 
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();
		if (nota >= 0 && nota <= 3) {
            System.out.println("Insuficiente: " + nota);
        } else if (nota == 4) {
            System.out.println("Suficiente: " + nota);
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien: " + nota);
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable: " + nota);
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente: " + nota );
        } else {
            System.out.println("Ingrese un numero del 1 al 10.");
        }
	}

}
