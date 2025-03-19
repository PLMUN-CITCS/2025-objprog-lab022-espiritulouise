public class Car {
    // Attributes
    private int year;
    private String make;
    private String model;

    // Constructor
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car(2020, "Toyota", "Corolla");
        
        // Displaying the car details
        myCar.displayCar();
    }
}
