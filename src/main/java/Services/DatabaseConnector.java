package Services;

import DbModels.*;

import java.sql.*;
import java.time.LocalDate;

public class DatabaseConnector {
    Connection connection;
    Statement statement;
    String url = "jdbc:mysql://localhost:3306/klapexdealer1";
    String userName = "ADMINISTRATOR";
    String password = "adminpassword";



    public DatabaseConnector(){
    }

    private boolean openConnection()  {
        try{
            this.connection = DriverManager.getConnection(url, userName, password);
            this.statement = this.connection.createStatement();
        }catch (SQLException error){
            System.out.println(error);
            return false;
        }
        return true;
    }

    private boolean closeConnection(){
        try{
            this.connection.close();
        }catch (SQLException error){
            System.out.println(error);
            return false;
        }
        return true;
    };


    public boolean insertValueIntoColors(String colorName, String colorType)  {
        if(openConnection()){
            try{
                this.statement.execute("insert into colors values (null,"+colorName+","+colorType+")");
                closeConnection();
                return true;
            }catch (SQLException error){
                System.out.println(error);
                closeConnection();
                return false;
            }
        }else{
            closeConnection();
            return false;
        }

    }

    public boolean insertValueIntoPersons(String address,String firstName, String lastName,String pesel, String userPassword, String date, String personType){
        if(openConnection()){
            try{
                return this.statement.execute("insert into persons values (null,'"+address+"','"+ date +"','"+firstName+"','"+lastName+"','"+pesel+"','"+userPassword+"','"+personType+"')");
            }catch (SQLException error){
                System.out.println(error);
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean insertValueIntoClients(int personId){
        if(openConnection()){
            try{
                return this.statement.execute("insert into clients values (null,"+personId+")");
            }catch (SQLException error){
                System.out.println(error);
                return false;
            }
        }else{
            return false;
        }
    }

    public ResultSet getModels(){
        if(openConnection()){
            try{
                return this.statement.executeQuery("SELECT * FROM models");
            }catch (SQLException error){
                System.out.println(error);
                return null;
            }
        }else{
            return null;
        }
    }

    public void addModel(Model model){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO models values (null,'"+model.bodyType+"','"+model.brandName+"','"+model.modelName+"','"+model.price+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }

    public void addEngine(Engine engine){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO engines values (null,'"+engine.capacity+"','"+engine.engineCode+"','"+engine.fuel+"','"+engine.horsePower+"','"+engine.power+"','"+engine.torque+"','"+engine.price+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }

    public void addGearbox(Gearbox gearbox){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO gearboxes values (null,'"+gearbox.gearboxCode+"','"+gearbox.gearboxType+"','"+gearbox.gearsNumber+"','"+gearbox.price+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }

    public void addColor(Color color){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO colors values (null,'"+color.colorName+"','"+color.colorType+"','"+color.price+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }

    public void addWheel(Wheel wheel){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO wheels values (null,'"+wheel.colorId+"','"+wheel.diameter+"','"+wheel.ET+"','"+wheel.producer+"','"+wheel.weight+"','"+wheel.width+"','"+wheel.price+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }

    public void addCar(Car car){
        if(openConnection()){
            try{
                this.statement.execute("INSERT INTO cars values (null,'"+car.drivetrain+"','"+car.engineId+"','"+car.gearboxId+"','"+car.interiorColorId+"','"+car.interiorColorId+"','"+car.mainColorId+"','"+car.modelId+"','"+car.wheelId+"')");
            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }




    public ResultSet loginPerson(String pesel, String userPassword){
        if(openConnection()){
            try{
                return this.statement.executeQuery("SELECT * FROM persons WHERE pesel = '"+pesel+"' AND password = '"+userPassword+"'");
            }catch (SQLException error){
                System.out.println(error);
                return null;
            }
        }else{
            return null;
        }


    }



}
