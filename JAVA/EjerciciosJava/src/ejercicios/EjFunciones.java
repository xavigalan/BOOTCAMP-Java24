
package ejercicios;
public class EjFunciones {

	// PARTE 1
	
	public static void main(String[] args) {
		System.out.println(javaOrNull("java"));
		System.out.println(javaOrNull("null"));
		
		System.out.println(login("admin","1234"));

		System.out.println("¿Es par?: " + aleatorio());
	}

	public static String javaOrNull(String input) {
		return input.equals("java") ? "java" : null;
	}
	
	// PARTE 2 
	
	public static String login(String user, String password) {
		if(user.equals("admin") && password.equals("1234")) {
			System.out.println("Your user is: "+ user);
		}
		String log = (user.equals("admin") && password.equals(("1234")) 
				? "Loggin true" : "Login false" );
		return log;
	}
	
	// PARTE 3 

	public static boolean aleatorio() {
		int randomnum = (int) (Math.random() * 100);
		System.out.println("Número generado: " + randomnum);
		return randomnum % 2 == 0;
	}
}
