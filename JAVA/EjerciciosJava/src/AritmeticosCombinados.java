
public class AritmeticosCombinados {

	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		int suma = a+b;
		System.out.println("Sumamos 25 + 5 = " + suma);
		
		int c = 15;
		int resta = suma-c;
		System.out.println("Restamos al valor actual " + suma + " - " + c + " = " + resta);
		
		int d = 2;
		int multiplicar = resta*d;
		System.out.println("Multiplicamos el valor actual "+ resta + " * " + d + " = " + multiplicar);
	
		int e = 2;
		int dividir = multiplicar/e;
		System.out.println("Dividimos el valor actual "+ multiplicar + " / " + e + " = " + dividir);
	
	}

}
