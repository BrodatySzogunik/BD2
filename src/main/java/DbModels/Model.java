package DbModels;

import Interfaces.BodyType;
import Interfaces.BrandName;

public class Model {
    public String bodyType;
    public String brandName;
    public String modelName;
    public int price;

    public Model(String bodyType, String brandName, String modelName, int price) {
        this.bodyType = bodyType;
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }
}
