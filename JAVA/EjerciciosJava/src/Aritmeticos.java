public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println("Restar 10 - 5 = "+ restale()); 
        System.out.println("Sumar 55 + 45 = "+ suma()); 
        System.out.println("Negar número 3 = "+ negar()); 
        System.out.println("Multiplicar 5 x 5 = "+ multiplicar()); 
        System.out.println("Dividr con numero entero 25 / 7 = "+ dividirentero()); 
        System.out.println("Dividr con numero real 25 / 7 = "+ dividirreal()); 
        }

    public static int restale() {
        int num1 = 10;
        int num2 = 5;
        int resta = num1 - num2;
        return resta;
    }
    
    public static int suma() {
        int num1 = 55;
        int num2 = 45;
        int suma = num1 + num2;
        return suma; 
    }
    
    public static int negar() {
    	int negado = 3;
    	negado = -negado;
    	return negado;
    }
    
    public static int multiplicar() {
    	int num1 = 5;
    	int multiplicar = num1 * num1;
    	return multiplicar;
    }
    public static int dividirentero() {
    	int num1 = 25;
    	int num2 = 7;
    	int dividirentero = num1/num2;
    	return dividirentero;
    }
    public static float dividirreal() {
    	float num1 = 25;
    	float num2 = 7;
    	float dividirreal = num1/num2;
    	return dividirreal;
    }
}
