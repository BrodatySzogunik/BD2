package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkerList extends JFrame{
    private JPanel WorkerList;
    private JScrollPane workerListJPanel;
    private JButton addNewWorkerButton;
    private JButton editButton;
    private JButton returnButton;

    public WorkerList(){
        setSize(500,500);
        setTitle("login");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(WorkerList);
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
