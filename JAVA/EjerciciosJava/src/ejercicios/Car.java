package ejercicios;

public class Car {
    private String fuel;
    private int maxSpeed;

    public Car() {
        this.fuel = "0L";   
        this.maxSpeed = 0;  
    }

    public Car(String fuel, int maxSpeed) {
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("The car is driving with fuel: " + fuel + " and max speed: " + maxSpeed + " km/h.");
    }
}
