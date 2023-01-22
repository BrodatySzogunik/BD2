package Forms;

import DbModels.CarInfo;
import DbModels.Person;
import DbModels.Order;
import Services.AvailableCarsService;
import Services.OrderService;

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
    private JList list1;
    DefaultListModel model = new DefaultListModel();
    private Person person = null;

    public ClientPanel(){
        System.out.println("construct");
        setTitle("Guest");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(clientPanel);
        this.configureCarButton.setEnabled(false);
        logOutButtonListener();
        this.setVisible(true);
    }

    public ClientPanel(Person person){
        this.person = person;
        setSize(400,500);
        setTitle("Client: "+person.first_name +" "+person.last_name);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        list1.setModel(model);
        initializeConfigureCarButton();
        initializeList();
        logOutButtonListener();
        ViewAvailableCarsButtonListener();
        this.setContentPane(clientPanel);
        this.setVisible(true);
    }

    private void logOutButtonListener(){
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login();
            }
        });
    }

    private void initializeConfigureCarButton(){
        this.configureCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CarConfiguration(person.person_id);
            }
        });
    }

    private void ViewAvailableCarsButtonListener(){
        this.configureCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new availableCars();
            }
        });
    }

    private void initializeList(){
        for (Order orders : OrderService.getOrdersById(person.getId())) {
            model.addElement(orders);
        }
    }

}
