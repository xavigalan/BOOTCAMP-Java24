
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
        
	}
	
    public static final String RESET = "\033[0m";

    // Colores de texto
    public static final String BLACK_TEXT = "\033[30m";

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


}
