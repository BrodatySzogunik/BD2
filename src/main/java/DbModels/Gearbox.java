package DbModels;

public class Gearbox {
    public String gearboxCode;
    public String gearboxType;
    public int gearsNumber;
    public int price;

    public Gearbox(String gearboxCode, String gearboxType, int gearsNumber, int price) {
        this.gearboxCode = gearboxCode;
        this.gearboxType = gearboxType;
        this.gearsNumber = gearsNumber;
        this.price = price;
    }
}
