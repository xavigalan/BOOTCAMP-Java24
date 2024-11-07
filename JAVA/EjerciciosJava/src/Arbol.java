public class Arbol {
    public static void main(String[] args) {
        int alturaPunta = 10;
        int baseAncho = 4;
        int alturaBase = 4;

        // Imprimir la parte de la punta del árbol
        for (int i = 1; i <= alturaPunta; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = i; j < alturaPunta; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {  // Cambié a (2 * i - 1) para mantener la forma
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }

        // Imprimir la base del árbol (tronco)
        for (int i = 0; i < alturaBase; i++) {
            // Imprimir espacios antes de los asteriscos para centrar el tronco
            for (int j = 0; j < alturaPunta - 2; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos del tronco
            for (int k = 0; k < baseAncho; k++) {
                System.out.print("*");
            }
            // Salto de línea después de imprimir la base
            System.out.println();
        }
    }
}
