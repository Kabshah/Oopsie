class Truck extends Vehicle {
    double loadCapacity;
    public Truck(String make, String model, int year, String fuelType,double loadCapacity){
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;}
    public double getMaxSpeed() {
        return 80; }// Maximum speed for truck
    public double calculateDistance(double speed, double time) {
        return speed * time;}
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");}}
class Car extends Vehicle {
    int numberOfDoors;
    // Constructor
    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year, fuelType);
        this.numberOfDoors = numberOfDoors;}
    public double getMaxSpeed() {
        return 180; }// Maximum speed for car
    public double calculateDistance(double speed, double time) {
        return speed * time;}
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);}}
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);}
    public double getMaxSpeed() {
        return 200; }// Maximum speed for motorcycle
    public double calculateDistance(double speed, double time) {
        return speed * time;}
    public void displayInfo() {
        super.displayInfo();}}
// Main testing within Vehicle class
public class Vehicle {
    String make,model,fuelType;
    int year;
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;}
    // Method to calculate distance traveled
    public double calculateDistance(double speed, double time) {
        return speed * time;}
    // Method to get maximum speed
    public double getMaxSpeed() {
        return 100; }// Default maximum speed
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);}
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2020, "Diesel", 10);
        Vehicle car = new Car("Toyota", "Camry", 2022, "Petrol", 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, "Petrol");

        System.out.println("Truck Info:");
        truck.displayInfo();
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
        System.out.println("Distance Traveled in 5 hours at 60 km/h: " + truck.calculateDistance(60, 5) + " km");
        System.out.println();

        System.out.println("Car Info:");
        car.displayInfo();
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
        System.out.println("Distance Traveled in 3 hours at 80 km/h: " + car.calculateDistance(80, 3) + " km");
        System.out.println();

        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
        System.out.println("Distance Traveled in 2 hours at 90 km/h: " + motorcycle.calculateDistance(90, 2) + " km");
    }
}