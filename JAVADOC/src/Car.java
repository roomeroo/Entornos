/**
 * Representa un coche con marca, modelo, año y precio.
 * 
 * @author arommal0105
 */
public class Car {
    /** Marca del coche */
    private String make;
    /** Modelo del coche */
    private String model;
    /** Año de fabricacion del coche */
    private int year;
    /** Precio del coche */
    private double price;

    /**
     * Constructor para crear un coche con todos sus datos.
     * 
     * @param make Marca del coche
     * @param model Modelo del coche
     * @param year Año de fabricacion
     * @param price Precio del coche
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /** 
     * Obtiene la marca del coche.
     * 
     * @return Marca del coche
     */
    public String getMake() {
        return make;
    }

    /** 
     * Establece la marca del coche.
     * 
     * @param make Marca del coche
     */
    public void setMake(String make) {
        this.make = make;
    }

    /** 
     * Obtiene el modelo del coche.
     * 
     * @return Modelo del coche
     */
    public String getModel() {
        return model;
    }

    /** 
     * Establece el modelo del coche.
     * 
     * @param model Modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Obtiene el año de fabricación del coche.
     * 
     * @return Año de fabricación
     */
    public int getYear() {
        return year;
    }

    /** 
     * Establece el año de fabricación del coche.
     * 
     * @param year Año de fabricación
     */
    public void setYear(int year) {
        this.year = year;
    }

    /** 
     * Obtiene el precio del coche.
     * 
     * @return Precio del coche
     */
    public double getPrice() {
        return price;
    }

    /** 
     * Establece el precio del coche.
     * 
     * @param price Precio del coche
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /** 
     * Devuelve una descripción del coche.
     * 
     * @return Descripción del coche
     */
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
