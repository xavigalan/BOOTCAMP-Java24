
package ejercicios;
public class TipoDatos {

	public static void main(String[] args) {
		Long valong = 10L;
		byte bait = 20;
		short corto = 30;
		Integer entero = 40;
		//¿Puedes obtener la clase a la que pertenecen todas ellas?
		// Respuesta: No, no puedo porque hay variable declaradas
		// que no son Wrappers tendríamos que pasarlo de PRIMITIVO A WRAPPER.
		// PRIMITIVOS byte, short.
		// WRAPPER Long, Integer.
		
        System.out.println("Estos eran valores ya definidos como Wrappers\n");
		System.out.println("Clase de valong: " + valong.getClass());
	    System.out.println("Clase de entero: " + entero.getClass());
	    
	    Byte byteWrapper = Byte.valueOf(bait);
        Short shortWrapper = Short.valueOf(corto);

        System.out.println("\nPodemos observar como hemos transformado de primitivo a wrapper\n");
    	
        System.out.println("Clase de bait (byte): " + byteWrapper.getClass());
        System.out.println("Clase de corto (short): " + shortWrapper.getClass());
    
        
        //EJERCICIO 2
        System.out.println("\nEjercicio 2");
        System.out.println("\nWrapper de String: " + getWrapper("String"));
        System.out.println("Wrapper de int: " + getWrapper(321));
        System.out.println("Wrapper de Long: " + getWrapper(123456789L));
        System.out.println("Wrapper de double: " + getWrapper(12.34));
    }

	public static String getWrapper(Object value) {
        if (value instanceof Integer) {
            return "Integer (Wrapper de int)";
        } else if (value instanceof Long) {
            return "Long (Wrapper de long)";
        } else if (value instanceof Double) {
            return "Double (Wrapper de double)";
        } else if (value instanceof Character) {
            return "Character (Wrapper de char)";
        } else if (value instanceof Byte) {
            return "Byte (Wrapper de byte)";
        } else if (value instanceof Short) {
            return "Short (Wrapper de short)";
        } else if (value instanceof Boolean) {
            return "Boolean (Wrapper de boolean)";
        } else if (value instanceof String) {
            return "String (Tipo de dato String)";
        } else {
            return "Tipo no soportado";
        }
	}
}
