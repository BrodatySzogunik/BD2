package DbModels;

public class AvailableCar {
    public int car_id;
    public int price;
    public int procudtion_year;

    public AvailableCar(int car_id, int price, int procudtion_year) {
        this.car_id = car_id;
        this.price = price;
        this.procudtion_year = procudtion_year;
    }
}
