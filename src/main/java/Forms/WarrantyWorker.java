package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WarrantyWorker extends JFrame{
    private JPanel WarrantyWorker;
    private JScrollPane warrantyList;
    private JButton acceptButton;
    private JButton rejectButton;
    private JButton returnButton;

    public WarrantyWorker(){
        setSize(500,500);
        setTitle("Warranty Claims");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(WarrantyWorker);
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
