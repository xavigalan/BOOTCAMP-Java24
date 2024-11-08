package main;

import segundo_package.HastaNunqui;
import segundo_package.HolaMundo;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola desde mi primer programa Java (CMD)");

		HolaMundo holamundo = new HolaMundo();
		System.out.println(holamundo.saludar());

		HastaNunqui hn = new HastaNunqui();
		System.out.println(hn.patada());
		
		// EJERCICIO PACKAGES La diferencia de HolaMundo y HastaNunqui
		// se que HolaMundo lo hemos importado en cambio HastaNunqui, por eso 
		// no reconoce el método hn.patada();
	}

	
}
