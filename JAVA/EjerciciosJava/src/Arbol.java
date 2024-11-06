public class Arbol {
    public static void main(String[] args) {
        int alturaPunta = 10;
        int baseAncho = 4;
        int alturaBase = 4;

        for (int i = 1; i <= alturaPunta; i++) {
            for (int j = i; j < alturaPunta; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < alturaBase; i++) {
            for (int j = 0; j < alturaPunta - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < baseAncho; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
