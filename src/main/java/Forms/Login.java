package Forms;

import Services.DatabaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
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
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnector connector = new DatabaseConnector();
                ResultSet result =  connector.loginPerson(loginTextField.getText(), passwordTextField.getText());
                new CarConfiguration();
                try {
                    result.next();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                try {
                    System.out.println(result.getString("person_type"));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }







}
