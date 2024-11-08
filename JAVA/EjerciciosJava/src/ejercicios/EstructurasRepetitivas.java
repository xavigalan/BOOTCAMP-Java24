
package ejercicios;
import java.util.ArrayList;

public class EstructurasRepetitivas {

	public static void main(String[] args) {
		int limit = 50;
		System.out.println("Números divisibles entre 2");
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Números divisibles entre 3");
		for (int t = 1; t <= limit; t++) {
			if (t % 3 == 0) {
				System.out.println(t);
			}
		}
	
		// SALUDA INDEPENDIENTEMENTE SE CUMPLA LA CODNICIÓN O NO
		int vecessaludo = 5;
		for(int i = 1; i <= vecessaludo; i++) {
			System.out.println("Un saludo crack en for " + i);
		}

		vecessaludo = 1;
		while(vecessaludo <= 5) {
			System.out.println("Un saludo crack en while " + vecessaludo);
			++vecessaludo;
		}

		vecessaludo = 1;
		do {
			System.out.println("Un saludo crack en do " + vecessaludo);
			vecessaludo++;
		} while (vecessaludo <= 5);
	
		// BUCLE DEL ABCDARIO HASTA DEJAR UNA A.Y.
		ArrayList<String> abecedario = new ArrayList<String>();
        
		for (char letra = 'A'; letra <= 'Z'; letra++) {
            abecedario.add(String.valueOf(letra));

            }
		
        for (int i = 0; i < abecedario.size(); i++) {
        	String letra = abecedario.get(i);
        	if (!letra.equals("A") && !letra.equals("Y")) {
        		abecedario.remove(i);
        		i--;
        		System.out.println(abecedario);
        		
        	}
        }

		}
	}


