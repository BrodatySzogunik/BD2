package DbModels;

public class Wheel {
    public int wheel_id;
    public int color_id;
    public int diameter;
    public int ET;
    public String producer;
    public float weight;
    public int width;
    public int price;

    public Wheel(int wheelId, int colorId, int diameter, int ET, String producer, float weight, int width, int price) {
        this.wheel_id = wheelId;
        this.color_id = colorId;
        this.diameter = diameter;
        this.ET = ET;
        this.producer = producer;
        this.weight = weight;
        this.width = width;
        this.price = price;
    }
}
