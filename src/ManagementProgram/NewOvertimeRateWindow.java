
package ManagementProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class to initialize a GUI to edit the overtime rate of all
 * hourly employees within an Emplist.
 * @author zacharykondak
 */
public class NewOvertimeRateWindow {

    /**
     * initializes a GUI to edit the overtime rate.
     * @param anEmplist the Emplist to be edited.
     */
    public NewOvertimeRateWindow(Emplist anEmplist) {

        //build the label and text are.
        JPanel gridPanel = new JPanel();
        GridLayout grid = new GridLayout(2, 2);
        gridPanel.setLayout(grid);
        gridPanel.add(new JLabel("                       NEW OVERTIME RATE: "));
        JTextArea rateField = new JTextArea(1, 15);
        gridPanel.add(rateField);
        JFrame frame = new JFrame("Edit Overtime Rate");

        
        //build the buttons.
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.dispose();
            }
        });

        gridPanel.add(cancelButton);

        JButton addButton = new JButton("Set");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                //make sure the user puts in a valid overtime rate.
                try {
                    anEmplist.setOvertimeRates(Double.parseDouble(rateField.getText()));
                    frame.dispose();
                    System.out.println("New overtime rate set.");
                } catch (Exception e) {
                    System.out.println("Unable to edit overtime rate. "
                            + "Please make sure that you put in a valid "
                            + "number for the new rate.");
                    frame.dispose();
                }
            }
        });

        gridPanel.add(addButton);
        grid.setVgap(10);

        //create and show the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gridPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

}
