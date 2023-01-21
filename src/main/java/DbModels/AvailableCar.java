package DbModels;

public class AvailableCar {
    public String car_id;
    public String price;
    public String procudtion_year;

    public AvailableCar() {}

    public AvailableCar(String car_id, String price, String procudtion_year) {
        this.car_id = car_id;
        this.price = price;
        this.procudtion_year = procudtion_year;
    }
}
