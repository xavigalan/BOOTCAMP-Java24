
public class EjBanderasANSI {

	public static void main(String[] args) {
		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "ESPAÑA"+ RESET);

		System.out.println(RED_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(RESET);

		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "UCRANIA" + RESET) ;
        System.out.println(BLUE_BG + "                    " + RESET);
        System.out.println(BLUE_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RESET);
        
		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "CATALUNYA"+ RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RESET);
       
		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "ALEMANIA"+ RESET);
        System.out.println(BLACK_BG + "                    " + RESET);
        System.out.println(BLACK_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(RED_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(YELLOW_BG + "                    " + RESET);
        System.out.println(RESET);

		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "FRANCIA"+ RESET);
        System.out.println(BLUE_BG + "       " + WHITE_BG + "       " + RED_BG + "       ");
        System.out.println(BLUE_BG + "       " + WHITE_BG + "       " + RED_BG + "       ");
        System.out.println(BLUE_BG + "       " + WHITE_BG + "       " + RED_BG + "       ");
        System.out.println(BLUE_BG + "       " + WHITE_BG + "       " + RED_BG + "       ");
        System.out.println(BLUE_BG + "       " + WHITE_BG + "       " + RED_BG + "       ");
        System.out.println(RESET);

		System.out.println(BLACK_TEXT + BOLD + UNDERLINE + "GRECIA"+ RESET);
        System.out.println(BLUE_BG + "   " + WHITE_BG + "  " + BLUE_BG + "   " + BLUE_BG + "             ");
        System.out.println(BLUE_BG + "   " + WHITE_BG + "  " + BLUE_BG + "   " + WHITE_BG + "             ");
        System.out.println(WHITE_BG + "   " + WHITE_BG + "     " + BLUE_BG + "             ");
        System.out.println(BLUE_BG + "   " + WHITE_BG + "  " + BLUE_BG + "   " + WHITE_BG + "             ");
        System.out.println(BLUE_BG + "   " + WHITE_BG + "  " + BLUE_BG + "   " + BLUE_BG + "             ");
		System.out.println(WHITE_BG + "                     " + RESET);
		System.out.println(BLUE_BG + "                     " + RESET);
		System.out.println(WHITE_BG + "                     " + RESET);
		System.out.println(BLUE_BG + "                     " + RESET);
        System.out.println(RESET);
        System.out.println(RESET);

        for (int i = 0; i < 10; i++) {
            // Llamar a la función para aplicar un color, fondo y formato aleatorio
            System.out.println(generarArcoirisAleatorio("Texto arcoíris " + (i + 1)));
        }
        System.out.println(RESET);
        
        		int alturaPunta = 10;
                int baseAncho = 3;
                int alturaBase = 4;
                String[] coloresFondo = {RED_BG, GREEN_BG, YELLOW_BG, BLUE_BG, PURPLE_BG, WHITE_BG};

                for (int i = 1; i <= alturaPunta; i++) {
                    for (int j = i; j < alturaPunta; j++) {
                        System.out.print(RESET + " ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {  // Cambié a (2 * i - 1) para mantener la forma
                        System.out.print(GREEN_BG + "*" );
                    }
                    System.out.println();
                }

                for (int i = 0; i < alturaBase; i++) {
                    for (int j = 0; j < alturaPunta - 2; j++) {
                        System.out.print(RESET + " ");
                    }
                    for (int k = 0; k < baseAncho; k++) {
                        System.out.print(BLACK_BG + "*");
                    }
                    System.out.println();
                }
	}
	
	public static String generarArcoirisAleatorio(String texto) {
        String[] coloresTexto = {BLACK_TEXT, RED_TEXT, GREEN_TEXT, YELLOW_TEXT, BLUE_TEXT, PURPLE_TEXT, WHITE_TEXT};

        String[] coloresFondo = {RED_BG, GREEN_BG, YELLOW_BG, BLUE_BG, PURPLE_BG, WHITE_BG};

        String[] formatos = {BOLD, UNDERLINE, REVERSED};

        String colorTexto = coloresTexto[(int) (Math.random() * coloresTexto.length)];
        String colorFondo = coloresFondo[(int) (Math.random() * coloresFondo.length)];
        String formato = formatos[(int) (Math.random() * formatos.length)];

        return colorTexto + colorFondo + formato + texto + RESET;
    }
    public static final String RESET = "\033[0m";

    // Colores de texto

    public static final String BLACK_TEXT = "\033[30m";
    public static final String RED_TEXT = "\033[31m";
    public static final String GREEN_TEXT = "\033[32m";
    public static final String YELLOW_TEXT = "\033[33m";
    public static final String BLUE_TEXT = "\033[34m";
    public static final String PURPLE_TEXT = "\033[35m";
    public static final String CYAN_TEXT = "\033[36m";
    public static final String WHITE_TEXT = "\033[37m";
    // Colores de fondo
    public static final String BLACK_BG = "\033[40m";
    public static final String RED_BG = "\033[41m";
    public static final String GREEN_BG = "\033[42m";
    public static final String YELLOW_BG = "\033[43m";
    public static final String BLUE_BG = "\033[44m";
    public static final String PURPLE_BG = "\033[45m";
    public static final String CYAN_BG = "\033[46m";
    public static final String WHITE_BG = "\033[47m";
    
    // Atributos de texto
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String REVERSED = "\033[7m";

    

}
