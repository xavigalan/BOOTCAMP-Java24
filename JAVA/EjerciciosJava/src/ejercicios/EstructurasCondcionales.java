
package ejercicios;
import java.util.Scanner;

public class EstructurasCondcionales {

	public static void main(String[] args) {
		// OPERADOR IFs
		System.out.println("----- Operador IFs -----");
		int ifs = (int) (Math.random() * 2);
		System.out.println("Tu número random es: " + ifs);
		if (ifs == 0) {
			System.out.println("El color es: rojo");
		}

		// OPERADOR Else
		System.out.println("----- Operador Sino -----");
		int sino = (int) (Math.random() * 2);
		System.out.println("Tu número random es: " + sino);
		if (sino == 0) {
			System.out.println("El color es: rojo");
		}else
			System.out.println("El color es: negro");
		
		// OPERADOR TERNARIO
		System.out.println("----- Operador Ternario -----");
		int ternario = (int) (Math.random() * 2);
		System.out.println("Tu número random es: " + ternario);
		String real = (ternario == 0) ? "rojo" : "negro";
		System.out.println("El color es: " + real);
		

        // Parte 2 Climas
		double temperatura = Math.random() * 40; 
        System.out.printf("Temperatura: %.1f °C%n", temperatura);
        String categoriaClima;
        String tipoClima;

        if (temperatura < 10) {
            categoriaClima = "Climas fríos";
        } else if (temperatura < 20) {
            categoriaClima = "Climas templados";
        } else {
            categoriaClima = "Climas cálidos";
        }

        if (temperatura < 5) {
            tipoClima = "Polar";
        } else if (temperatura < 10) {
            tipoClima = "Alta montaña";
        } else if (temperatura < 13.5) {
            tipoClima = "Oceánico";
        } else if (temperatura < 16.5) {
            tipoClima = "Mediterráneo";
        } else if (temperatura < 20) {
            tipoClima = "Continental";
        } else if (temperatura < 23.5) {
            tipoClima = "Ecuatorial";
        } else if (temperatura < 26.5) {
            tipoClima = "Tropical";
        } else {
            tipoClima = "Desértico";
        }

        System.out.println("Categoría del clima: " + categoriaClima);
        System.out.println("Tipo de clima: " + tipoClima);
                
        // Parte 3 Númerico a String
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Tu número es: " + numero);
        String textnumero;
        switch (numero) {
        case 1:
        	textnumero = "Uno";
        	System.out.println(textnumero);
        	break;
        case 2:
        	textnumero = "Dos";
        	System.out.println(textnumero);
        	break;
        case 3:
        	textnumero = "Tres";
        	System.out.println(textnumero);
        	break;
        case 4:
        	textnumero = "Cuatro";
        	System.out.println(textnumero);
        	break;
        case 5:
        	textnumero = "Cinco";
        	System.out.println(textnumero);
        	break;
        case 6:
        	textnumero = "Seis";
        	System.out.println(textnumero);
        	break;
        case 7:
        	textnumero = "Siete";
        	System.out.println(textnumero);
        	break;
        case 8:
        	textnumero = "Ocho";
        	System.out.println(textnumero);
        	break;
        case 9:
        	textnumero = "Nueve";
        	System.out.println(textnumero);
        	break;
        }

        // Parte 4 Transforma if-elseif-else a opternario
        System.out.println("Dame un valor númerico y te diré si es positivo o negativo");
        double number = sc.nextDouble();
        
        String transformar = ((number > 0) ? "Es positivo!" : (number < 0 ) ? "Es negativo" : "Es cero!!");
        System.out.println(transformar);

	}
	
	

}
