

package ManagementProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class to initialize a GUI to add a new salaried employee to an Emplist.
 * @author zacharykondak
 */
public class NewSalariedWindow {
    
    /**
     * Creates and initializes the GUI.
     * @param anEmplist the Emplist to be added to.
     */
    public NewSalariedWindow(Emplist anEmplist) {

        //build the labels and text areas.
        JPanel gridPanel = new JPanel();
        GridLayout grid = new GridLayout(5, 2);
        gridPanel.setLayout(grid);
        gridPanel.add(new JLabel("                        NAME: "));
        JTextArea nameField = new JTextArea(1, 15);
        gridPanel.add(nameField);
        gridPanel.add(new JLabel("                        SALARY: "));
        JTextArea salaryField = new JTextArea(1, 15);
        gridPanel.add(salaryField);
        gridPanel.add(new JLabel("                        OVERTIME HOURS: "));
        JTextArea overtimeHoursField = new JTextArea(1, 15);
        gridPanel.add(overtimeHoursField);
        gridPanel.add(new JLabel("                        OVERTIME RATE: "));
        JTextArea overtimeRateField = new JTextArea(1, 15);
        gridPanel.add(overtimeRateField);
        JFrame frame = new JFrame("Add a New Salaried Worker");

        //build the buttons.
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
                //make sure the user puts valid values in the fields.
                try {
                anEmplist.add(new Salaried(nameField.getText(),
                        Double.parseDouble(salaryField.getText()),
                        Double.parseDouble(overtimeHoursField.getText()),
                        Double.parseDouble(overtimeRateField.getText())
                ));
                System.out.println("New salaried worker successfully added.");
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
