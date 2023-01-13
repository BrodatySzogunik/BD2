package Services;

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


    public ResultSet loginPerson(String pesel, String userPassword){
        if(openConnection()){
            try{
                return this.statement.executeQuery("SELECT person_id FROM persons WHERE pesel = '"+pesel+"' AND password = '"+userPassword+"'");
            }catch (SQLException error){
                System.out.println(error);
                return null;
            }
        }else{
            return null;
        }


    }



}
