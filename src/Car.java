public class Car extends Vehicle {
    public double weight;

    public Car(String model, String color, int year, double weight) {
        super(model, color, year);
        this.weight = weight;
    }
    public String info(){
        return "Model: " + this.model + ", Color: " + this.color + ", Year: " + this.year + ", Weight: " + this.weight;
    }
}
