package Services;

import DbModels.*;
import Interfaces.ColorType;
import Interfaces.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static ArrayList<Color> getColorsByType(String type) {
        DatabaseConnector db = new DatabaseConnector();
        try{
            ArrayList<Color> result = ResultSetConverter.resultSetToArrayList(db.getColors(), Color.class);
            List<Color> filterResult = result.stream().filter(color -> color.color_type.equals(type)).collect(Collectors.toList());
            return new ArrayList<Color>(filterResult);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static void addNewOrder(String drivetrain, String engineId, String gearboxId, String additionalColorId, String interiorColorId, String mainColorId, String modelId, String wheelId, String clientId){
        DatabaseConnector db = new DatabaseConnector();
        Car car = new Car(drivetrain,engineId,gearboxId,additionalColorId,interiorColorId,mainColorId,modelId,wheelId);
        String newCarId = db.addCar(car);
        try{
            db.addOrder(new Order(null,clientId,null,newCarId,null,DateService.ToString(LocalDate.now()), Status.NEW,"10"));
        }catch (Exception e){
            System.out.println(e);
        }

    }


}
