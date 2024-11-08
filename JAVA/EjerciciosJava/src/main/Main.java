package main;
// EJERCICIO PACKAGES La diferencia de HolaMundo y HastaNunqui

// se que HolaMundo lo hemos importado en cambio HastaNunqui, por eso 
// no reconoce el método hn.patada();

import ejercicios.Car;
import ejercicios.Tarjeta;

import segundo_package.HastaNunqui;
import segundo_package.HolaMundo;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola desde mi primer programa Java (CMD)");

        HolaMundo holamundo = new HolaMundo();
        System.out.println(holamundo.saludar());

        HastaNunqui hn = new HastaNunqui();
        System.out.println(hn.patada());

        // CONSTRUCTOR VACIO
        Car car = new Car();
        car.setFuel("50L");
        car.setMaxSpeed(180);
        System.out.println("Car fuel: " + car.getFuel() + " Max Speed of car: " + car.getMaxSpeed());

        // CONSTRUCTOR LLENO
        Car carlleno = new Car("30L", 50);
        System.out.println("Car fuel: " + carlleno.getFuel() + " Max Speed of car: " + carlleno.getMaxSpeed());

        // Constructor Vacio
        Tarjeta tarjeta1 = new Tarjeta();
        tarjeta1.setEntidademisora("BBVA");
        tarjeta1.setNumero(13241123);
        tarjeta1.setFecha("28/8");
        tarjeta1.setTitular("Xavi Galán Pérez");

        // Ejercicio TARJETA
        System.out.println("\nEjercicio TARJETA");
        System.out.println("\nEntidad emisora: " + tarjeta1.getEntidademisora());
        System.out.println("Número: " + tarjeta1.getNumero());
        System.out.println("Fecha de expiración: " + tarjeta1.getFecha());
        System.out.println("Titular: " + tarjeta1.getTitular());
        System.out.println("¿Está activa?: " + tarjeta1.isActiva());
        System.out.println("Intento realizar un pago!!");
        tarjeta1.pagar(150.50);  // Realiza un pago de 150.50€


        // Activar tarjeta
        tarjeta1.activarTarjeta();  // Activa la tarjeta
        System.out.println("¿Está activa después de activar?: " + tarjeta1.isActiva());

        // Realizar un pago
        tarjeta1.pagar(150.50);  // Realiza un pago de 150.50€
    }
}