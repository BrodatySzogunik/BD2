package DbModels;

public class Wheel {
    public int colorId;
    public int diameter;
    public int ET;
    public String producer;
    public float weight;
    public int width;
    public int price;

    public Wheel(int colorId, int diameter, int ET, String producer, float weight, int width, int price) {
        this.colorId = colorId;
        this.diameter = diameter;
        this.ET = ET;
        this.producer = producer;
        this.weight = weight;
        this.width = width;
        this.price = price;
    }
}
