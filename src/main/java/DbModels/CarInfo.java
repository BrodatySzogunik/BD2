package DbModels;

public class CarInfo {
    public String brand_name;
    public String model_name;
    public String body_type;
    public String capacity;
    public String fuel;
    public String horse_power;
    public String gearbox_type;
    public String gears_number;
    public String diameter;
    public String color_name;

    public CarInfo() {
    }

    @Override
    public String toString(){
        return ("Brand: "+this.brand_name+" , Model: "+ this.model_name+" , Body type: "+this.body_type+" , Engine capacity: "+this.capacity+" , Fuel: "+this.fuel+" , HP: "+this.horse_power+" , Gearbox type: "+this.gearbox_type+" , Gears number: "+this.gears_number+" , Wheels diameter: "+this.diameter+" , Color: "+this.color_name);
    }
    public CarInfo(String brand_name, String model_name, String body_type, String capacity, String fuel, String horse_power, String gearbox_type, String gears_number, String diameter, String color_name) {

        this.brand_name = brand_name;
        this.model_name = model_name;
        this.body_type = body_type;
        this.capacity = capacity;
        this.fuel = fuel;
        this.horse_power = horse_power;
        this.gearbox_type = gearbox_type;
        this.gears_number = gears_number;
        this.diameter = diameter;
        this.color_name = color_name;
    }

}
