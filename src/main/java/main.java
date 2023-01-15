import Forms.Login;
import Services.DatabaseConnector;

import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();

        new Login();


//        ResultSet response =  connector.loginPerson("21374206966","dupa123");
//        response.next();
//        System.out.println(response.getInt("person_id"));
//
//        connector.insertValueIntoClients(6);

    }



}





