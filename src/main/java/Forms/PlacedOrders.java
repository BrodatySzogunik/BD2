package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlacedOrders extends JFrame{
    private JPanel PlacedOrders;
    private JButton returnButton;
    private JButton changeStatusButton;
    private JComboBox orderStatus;

    public PlacedOrders(){
        setSize(500,500);
        setTitle("Placed Orders");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(PlacedOrders);
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
