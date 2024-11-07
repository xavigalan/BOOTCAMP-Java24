public class InstruccionesSalto {

	public static void main(String[] args) {
		int limit = 3;
		for (int i = 1; i <= limit; i++) {
			System.out.println("En la tercera vuelta salimos del bucle con for, la vuelta es: "+ i);
		}
		int s = 0;
		while (s>=limit) {
			++s;
			System.out.println("En la tercera vuelta salimos del bucle con while, la vuelta es: "+ s);
		}

        for (int i = 1; i <= 7; i++) { 
            if (i == 5) {
                continue; 
            }
            System.out.println("Iteración " + i + ": Este es un mensaje de ejemplo");
        }
        System.out.println("Fin del bucle principal");
	}

}
