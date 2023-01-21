package Forms;

import Interfaces.PersonType;
import Services.DatabaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class availableCars extends JFrame{
    private JPanel availableCars;
    private JScrollPane availableCarsList;
    private JButton returnButton;
    private JButton buyButton;

    public availableCars(){
        setSize(500,500);
        setTitle("login");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(availableCars);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        reutrnButtonListener();
    }

    private void reutrnButtonListener(){
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
