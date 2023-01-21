package Forms;

import DbModels.Person;

import javax.swing.*;

public class ClientPanel extends  JFrame {
    private JButton configureCarButton;
    private JButton viewAvailableCarsButton;
    private JScrollPane orderdCarsList;
    private JButton warrantyClaimButton;
    private JButton logOutButton;
    private JPanel clientPanel;

    public ClientPanel(){
        System.out.println("construct");
        setTitle("Guest");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(clientPanel);
        this.setVisible(true);
    }

    public ClientPanel(Person person){
        setSize(400,500);
        setTitle("Client: "+person.first_name +" "+person.last_name);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(clientPanel);
        this.setVisible(true);
    }



}
