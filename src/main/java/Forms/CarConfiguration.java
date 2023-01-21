package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarConfiguration extends JFrame{
    private JComboBox firstColor;
    private JPanel CarConfiguration;
    private JComboBox secondaryColor;
    private JComboBox engine;
    private JComboBox model;
    private JComboBox gearBox;
    private JComboBox interiorColor;
    private JComboBox wheels;
    private JButton returnButton;
    private JButton proccedButton;
    private JComboBox drivetrain;
    private JTextField priceTextField;

    public CarConfiguration(){
        setSize(500,500);
        setTitle("Car Configuration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(CarConfiguration);
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
