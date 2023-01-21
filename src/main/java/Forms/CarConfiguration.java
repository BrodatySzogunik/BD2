package Forms;

import DbModels.Engine;
import DbModels.Model;
import DbModels.Wheel;
import Services.CarConfigurationService;

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
    private JButton returnButton;
    private JButton proccedButton;
    private JComboBox drivetrain;
    private JTextField priceTextField;

    public CarConfiguration(){
        setSize(400,500);
        setTitle("Car configuration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(CarConfiguration);
        initializeEngines();
        initializeModels();
        initializeWheels();
        this.setVisible(true);

    }


    private void initializeEngines(){
        for(Engine engine :CarConfigurationService.getEngines()){
            this.engine.addItem(engine);
        }
    }

    private void initializeModels(){
        for(Model model :CarConfigurationService.getModels()){
            this.model.addItem(model);
        }
    }

    private void initializeWheels(){
        for(Wheel wheel  :CarConfigurationService.getWheels()){
            this.wheels.addItem(wheel);
        }
    }


}
