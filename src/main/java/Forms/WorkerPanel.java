package Forms;

import DbModels.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkerPanel extends JFrame{
    private JButton createClientAccountButton;
    private JButton editAvailableOffersButton;
    private JButton warrantyClaimsButton;
    private JButton logOutButton;
    private JButton placedOrdersButton;
    private JButton workersListButton;
    private JPanel WorkerPanel;
    private Person person;
    public WorkerPanel(Person person){
        this.person = person;
        setSize(500,500);
        setTitle("Worker: "+this.person.first_name +" "+this.person.last_name);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(WorkerPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        logOutButtonListener();
        initializeCreateClientAccountButton();

    }

    private void logOutButtonListener(){
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void initializeCreateClientAccountButton(){
        createClientAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateClientAccount();
            }
        });
    }
}
