package DbModels;

public class Engine {
    public int capacity;
    public String engineCode;
    public String fuel;
    public int horsePower;
    public int power;
    public int torque;
    public int price;

    public Engine(int capacity, String engineCode, String fuel, int horsePower, int power, int torque, int price) {
        this.capacity = capacity;
        this.engineCode = engineCode;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.power = power;
        this.torque = torque;
        this.price = price;
    }
}
