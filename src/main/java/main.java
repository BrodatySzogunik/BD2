import DbModels.*;
import Forms.Login;
import Interfaces.*;
import Services.DatabaseConnector;
import Services.ResultSetConverter;

import java.sql.*;

public class main {
    public static void main(String[] args) throws Exception {
        DatabaseConnector connector = new DatabaseConnector();


//        connector.addPerson(new Person("Lipinki łużycke łączna 43","2000-11-03","Marcin","Ganp","21374202111","dupa",PersonType.WORKER));
//        connector.addCar(new Car(Drivetrain.AWD,1,1,1,1,1,1,1));
//        connector.addWheel(new Wheel(10,20,40,"BBS",20,4,4000));
//        connector.addColor(new Color("Red", ColorType.PRIMARY,2000));
//        connector.addGearbox(new Gearbox("HU1",GerboxType.AUTOMATIC,12 ,28000));
//        connector.addEngine(new Engine(2137,"RB43", Fuel.PETROL,220,110,300,40000));
//        connector.addModel(new Model(BodyType.COMBI, BrandName.CITROEN, "C5",100000));

//        new Login();
//
//        System.out.println(ResultSetConverter.resultSetToArrayList(connector.getModels(),Model.class).get(1).model_id);

//        System.out.println(Model.class.getConstructor());



//        ResultSet response =  connector.loginPerson("21374206966","dupa123");
//        response.next();
//        System.out.println(response.getInt("person_id"));
//
//        connector.insertValueIntoClients(6);

    }



}





