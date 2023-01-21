package Services;

import DbModels.*;

import java.util.ArrayList;

public class CarConfigurationService {

    public static ArrayList<Model> getModels() {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getModels(),Model.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<Engine> getEngines()  {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getEngines(),Engine.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    public static ArrayList<Wheel> getWheels() {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getWheels(), Wheel.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<Gearbox> getGearboxes()  {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getGearboxes(), Gearbox.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<Color> getColors() {
        DatabaseConnector db = new DatabaseConnector();
        try{
            return ResultSetConverter.resultSetToArrayList(db.getColors(), Color.class);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }


}
