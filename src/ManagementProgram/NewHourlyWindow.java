

package ManagementProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class to initialize a GUI to add a new hourly employee to an Emplist.
 * @author zacharykondak
 */
public class NewHourlyWindow {
    
    /**
     * Creates and initializes the GUI.
     * @param anEmplist the Emplist to be added to.
     */
    public NewHourlyWindow(Emplist anEmplist) {

        
        //builds the labels and text fields
        JPanel gridPanel = new JPanel();
        GridLayout grid = new GridLayout(4, 2);
        gridPanel.setLayout(grid);
        gridPanel.add(new JLabel("                           NAME: "));
        JTextArea nameField = new JTextArea(1, 15);
        gridPanel.add(nameField);
        gridPanel.add(new JLabel("                           HOURS: "));
        JTextArea hoursField = new JTextArea(1, 15);
        gridPanel.add(hoursField);
        gridPanel.add(new JLabel("                           HOURLY RATE: "));
        JTextArea rateField = new JTextArea(1, 15);
        gridPanel.add(rateField);
        JFrame frame = new JFrame("Add a New Hourly Worker");

        
        //build the buttons
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.dispose();
            }
        });

        gridPanel.add(cancelButton);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                //make sure the user puts in valid values in the fields.
                try {
                anEmplist.add(new Hourly(nameField.getText(),
                        Double.parseDouble(hoursField.getText()),
                        Double.parseDouble(rateField.getText())
                ));
                System.out.println("New hourly worker successfully added.");
                frame.dispose();
                }
                catch (Exception e) {
                    System.out.println("Unable to add Employee. Please make"
                            + " sure that all fields are filled out with valid"
                            + " input.");
                    frame.dispose();
                }
            }
        });

        gridPanel.add(addButton);
        grid.setVgap(5);

        //create and show the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gridPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
    
}
