package DbModels;

public class Gearbox {
    public int gearbox_id;
    public String gearbox_code;
    public String gearbox_type;
    public int gears_number;
    public int price;

    public Gearbox(int gearboxId,String gearboxCode, String gearboxType, int gearsNumber, int price) {
        this.gearbox_id = gearboxId;
        this.gearbox_code = gearboxCode;
        this.gearbox_type = gearboxType;
        this.gears_number = gearsNumber;
        this.price = price;
    }
}
