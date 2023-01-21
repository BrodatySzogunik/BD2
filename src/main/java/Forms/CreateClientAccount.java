package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateClientAccount extends JFrame{
    private JButton returnButton;
    private JButton proccedButton;
    private JTextField first_name_text;
    private JTextField last_name_text;
    private JTextField birth_date_text;
    private JTextField pesel_text;
    private JTextField postal_code_text;
    private JTextField city_text;
    private JTextField street_text;
    private JTextField building_number_text;
    private JPasswordField password_pass_text;
    private JCheckBox clientCheckBox;
    private JCheckBox workerCheckBox;
    private JPanel createClientAccount;

    public CreateClientAccount(){
        setSize(500,500);
        setTitle("login");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(createClientAccount);
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
