/**
 * 
 *  La clase Car representa un coche con sus características como la marca, modelo, año y precio. 
 * 
 */
public class Car {
    /** La marca del coche */
    private String make;
    /** El modelo del coche */
    private String model;
    /** El año de fabricación del coche */
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    @Override
    public String toString() {
        return carDescription();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}