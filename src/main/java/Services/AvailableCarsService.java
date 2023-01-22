package Services;

import DbModels.*;

import java.util.ArrayList;

public class AvailableCarsService {
    public static ArrayList<AvailableCar> getAvailableCars() {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getAvailableCars(), AvailableCar.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<CarInfo> getAvailableCarsInfo() {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getAvailableCarsInfo(), CarInfo.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}