package DbModels;

public class Color {
    public int color_id;
    public String color_name;
    public String color_type;
    public int price;

    public Color(String colorName, String colorType, int price) {
        this.color_name = colorName;
        this.color_type = colorType;
        this.price = price;
    }
}
