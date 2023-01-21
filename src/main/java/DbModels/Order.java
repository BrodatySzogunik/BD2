package DbModels;

public class Order {
    public int order_id;
    public int client_id;
    public String estimated_delivery_date;
    public int order_car_id;
    public int order_custodian_id;
    public String order_date;
    public String order_status;
    public int price;

    public Order(int orderId,int clientId, String estimatedDeliveryDate, int orderedCarId, int orderCustodianId, String orderDate, String orderStatus, int price) {
        this.order_id = orderId;
        this.client_id = clientId;
        this.estimated_delivery_date = estimatedDeliveryDate;
        this.order_car_id = orderedCarId;
        this.order_custodian_id = orderCustodianId;
        this.order_date = orderDate;
        this.order_status = orderStatus;
        this.price = price;
    }
}
