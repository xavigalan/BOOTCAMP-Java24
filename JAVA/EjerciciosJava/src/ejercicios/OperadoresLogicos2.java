
package ejercicios;
import java.util.Scanner;

public class OperadoresLogicos2 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Escribe un numero:");
    	
    	int numero = scanner.nextInt();
    	
    	String resultado = (numero % 2 == 0)? "par" : "impar";
    	
    	System.out.println("Tu número es " + numero + " y el resultado es "+ resultado +"." );
    	
    	int random = (int) (Math.random() * 2);  // Genera 0 o 1
    	System.out.println("Tu número random es: " + random);
    	String color = (random == 0) ? "blanco" : "negro";

    	System.out.println("El color es " + color + ".");

    
    
    }
}
