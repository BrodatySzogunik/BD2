package Forms;

import javax.swing.*;

public class CarConfiguration extends JFrame{
    private JComboBox firstColor;
    private JPanel CarConfiguration;
    private JComboBox secondaryColor;
    private JComboBox engine;
    private JComboBox model;
    private JComboBox gearBox;
    private JComboBox interiorColor;
    private JComboBox wheels;

    public CarConfiguration(){
        setSize(200,200);
        setTitle("Car configuration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(CarConfiguration);
        this.setVisible(true);

    }
}
