
public class ConversionDatos {

	public static void main(String[] args) {

		// DESCENDENTE EJERCICIO 1
		double numDouble = 99999.12345;
		System.out.println("Valor en double: " + numDouble);
		
		float numFloat = (float) numDouble;
		System.out.println("Valor en float: " + numFloat);
		
		long numLong = (long) numFloat;
		System.out.println("Valor en long: " + numLong);
	
		int numInt = (int) numLong;
		System.out.println("Valor en int: " + numInt);
		
		short numShort = (short) numInt;
		System.out.println("Valor en short: " + numShort);
		
		byte numByte = (byte) numShort;
		System.out.println("Valor en byte: " + numByte);
	
		// ASCENDENTE EJERCICIO 2
		System.out.println("\nASCENDENTE\n");
		byte AscnumByte = 127;
		System.out.println("Valor en byte: " + AscnumByte);
	
		short AscnumShort = (short) AscnumByte;
		System.out.println("Valor en short: " + AscnumShort);
		
		int AscnumInt = (int) AscnumShort;
		System.out.println("Valor en int: " + AscnumInt);
		
		long AscnumLong = (long) AscnumInt;
		System.out.println("Valor en long: " + AscnumLong);
		
		float AscnumFloat = (float) AscnumLong;
		System.out.println("Valor en float: " + AscnumFloat);
		
		double AscnumDouble = (double) AscnumLong;
		System.out.println("Valor en double: " + AscnumDouble);
		
		//EJERCICIO 3 
		
		byte cien = 100;
		cien = (byte) (cien * 2);
		System.out.println("Resultado de 100 x 2: " + cien);
		// 3. Declara un tipo de dato byte e inicializa la variable a 100.
		// Modifica el valor de la variable multiplicando su valor x 2 ¿Qué está
		// pasando? ¿Cómo lo arreglarías?
		
		// Lo que ocurre es un desbordamiento, entonces lo que hace es
		// poner el valor en negativo devolviendo el valor sobrante, 
		// para evitar esto tenemos que llegar al límite del tipo byte que es
		// 127 o cambiar el tipo de dato.

	

		
	}

}
