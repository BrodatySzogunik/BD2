package Forms;

import DbModels.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPanel extends  JFrame {
    private JButton configureCarButton;
    private JButton viewAvailableCarsButton;
    private JScrollPane orderdCarsList;
    private JButton warrantyClaimButton;
    private JButton logOutButton;
    private JPanel clientPanel;
    private JTextField textField1;
    private Person person = null;

    public ClientPanel(){
        System.out.println("construct");
        setTitle("Guest");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(clientPanel);
        this.configureCarButton.setEnabled(false);
        this.setVisible(true);
    }

    public ClientPanel(Person person){
        this.person = person;
        setSize(400,500);
        setTitle("Client: "+person.first_name +" "+person.last_name);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(clientPanel);
        initializeConfigureCarButton();
        this.setVisible(true);
    }


    private void initializeConfigureCarButton(){
        this.configureCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CarConfiguration(person.person_id);
            }
        });
    }



}
