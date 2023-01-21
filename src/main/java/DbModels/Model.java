package DbModels;

public class Model {
    public int model_id;
    public String body_type;
    public String brand_name;
    public String model_name;
    public int price;

    public Model(int modelId, String bodyType, String brandName, String modelName, int price) {
        this.model_id = modelId;
        this.body_type = bodyType;
        this.brand_name = brandName;
        this.model_name = modelName;
        this.price = price;
    }
}
