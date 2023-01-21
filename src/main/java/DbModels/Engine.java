package DbModels;

public class Engine {
    public int engine_id;
    public int capacity;
    public String engine_code;
    public String fuel;
    public int horse_power;
    public int power;
    public int torque;
    public int price;

    public Engine(int engine_id, int capacity, String engineCode, String fuel, int horsePower, int power, int torque, int price) {
        this.engine_id = engine_id;
        this.capacity = capacity;
        this.engine_code = engineCode;
        this.fuel = fuel;
        this.horse_power = horsePower;
        this.power = power;
        this.torque = torque;
        this.price = price;
    }
}
