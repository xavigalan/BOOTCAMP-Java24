
package ejercicios;

import java.util.ArrayList;

public class EjRecursividad {
	public static void main(String[] args) {
		//EJ1
		String[] tecnologies = { "Markdown", "Regexp", "Html", "CSS", "JS", "SQL", "Java" };

		for (int i = 0; i < 3; i++) {
			String listatec = tecnologies[i];;
			System.out.println(listatec);
		}
		System.out.println("\r"
				+ "		//EJ3 supercalifragil");
		
		
		//EJ3 supercalifragil
        String palabra = "supercalifragilisticoespialidoso";
        String palabraInvertida = invertir(palabra);
        
        System.out.println("\nPalabra original: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);
	}
	
	public static String invertir (String palabra) {
		if (palabra.isEmpty()) {
			return palabra;
		}
		return invertir(palabra.substring(1)) + palabra.charAt(0);
	}

}
