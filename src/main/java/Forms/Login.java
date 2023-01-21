package Forms;

import DbModels.Person;
import Interfaces.PersonType;
import Services.DatabaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Login extends JFrame {
    private JButton loginButton;
    private JPasswordField passwordTextField;
    private JTextField loginTextField;
    private JButton useAsGuestButton;
    private JPanel LoginPanel;

    public Login(){
        setSize(200,200);
        setTitle("login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(LoginPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        loginButtonListener();
    }

    private void loginButtonListener(){
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnector connector = new DatabaseConnector();
                ResultSet result =  connector.loginPerson(loginTextField.getText(), passwordTextField.getText());
                try {
                    result.next();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    String personType = result.getString("person_type");
                    System.out.println(personType);
                    if(personType.equals(PersonType.CLIENT)){
                        new ClientPanel();
                    }else if(personType ==  PersonType.WORKER){
                        new WorkerPanel();
                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }







}
