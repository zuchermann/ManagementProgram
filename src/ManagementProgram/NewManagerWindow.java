
package ManagementProgram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class to initialize a GUI to add a new manager to an Emplist.
 * @author zacharykondak
 */
public class NewManagerWindow {
    
    /**
     * Creates and initializes the GUI.
     * @param anEmplist the Emplist to be added to.
     */
    public NewManagerWindow(Emplist anEmplist) {

        //build the panels and text areas.
        JPanel gridPanel = new JPanel();
        GridLayout grid = new GridLayout(4, 2);
        gridPanel.setLayout(grid);
        gridPanel.add(new JLabel("                            NAME: "));
        JTextArea nameField = new JTextArea(1, 15);
        gridPanel.add(nameField);
        gridPanel.add(new JLabel("                            SALARY: "));
        JTextArea salaryField = new JTextArea(1, 15);
        gridPanel.add(salaryField);
        gridPanel.add(new JLabel("                            BONUS: "));
        JTextArea bonusField = new JTextArea(1, 15);
        gridPanel.add(bonusField);
        JFrame frame = new JFrame("Add a New Manager");

        
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
                anEmplist.add(new Manager(nameField.getText(),
                        Double.parseDouble(salaryField.getText()),
                        Double.parseDouble(bonusField.getText())));
                System.out.println("New manager successfully added.");
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
