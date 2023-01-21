package DbModels;

public class Order {
    public int clientId;
    public String estimatedDeliveryDate;
    public int orderedCarId;
    public int orderCustodianId;
    public String orderState;
    public String orderDate;
    public String orderStatus;
    public int price;

    public Order(int clientId, String estimatedDeliveryDate, int orderedCarId, int orderCustodianId, String orderState, String orderDate, String orderStatus, int price) {
        this.clientId = clientId;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.orderedCarId = orderedCarId;
        this.orderCustodianId = orderCustodianId;
        this.orderState = orderState;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.price = price;
    }
}
