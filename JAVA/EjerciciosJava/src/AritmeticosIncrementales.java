
public class AritmeticosIncrementales {

	static int numero = 0;

	static int decremento = 5;

	public static void incrementar() {
		System.out.println(++numero);
	}
	public static void decrementar() {
		System.out.println(--decremento);
	}
	
	public static void main(String[] args) {
		incrementar();
		decrementar();
	}
}
