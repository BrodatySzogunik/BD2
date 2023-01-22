package Services;

import DbModels.Order;

import java.util.ArrayList;

public class OrderService {
    public static ArrayList<Order> getOrders(){
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getOrders(),Order.class);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    };

    public static void updateOrderStatus(String orderId, String newValue){
        DatabaseConnector db = new DatabaseConnector();
        try{
            db.updateOrder("order_status",newValue, orderId);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void updateOrderEstimatedDeliveryDate(String orderId, String newValue){
        DatabaseConnector db = new DatabaseConnector();
        try{
            db.updateOrder("order_custodian_id",newValue, orderId);
        }catch (Exception e){
            System.out.println(e);
        }
    };
    public static void updateOrderCustodian(String orderId, String newValue){
        DatabaseConnector db = new DatabaseConnector();
        try{
            db.updateOrder("estimated_deliveryDate",newValue, orderId);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
