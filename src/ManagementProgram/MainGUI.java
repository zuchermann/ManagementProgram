
package ManagementProgram;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author zacharykondak
 */
public class MainGUI {

    /**
     * Text field to view printed output.
     */
    private JTextArea outField;
    /**
     * an Emplist object to be initialized.
     */
    private Emplist anEmplist;

    /**
     * Method to update outField.
     * @param text text to be added to outField.
     */
    private void updateTextArea(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                outField.append(text);
            }
        });
    }

    /**
     * method to redirect System.out to outField.
     */
    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                updateTextArea(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextArea(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }

    
    /**
     * Constructs a new MainGUI object; initializes the GUI.
     */
    public MainGUI() {
        //redirects System.out to outField.
        this.redirectSystemStreams();
        //build outField.
        anEmplist = new Emplist();
        JPanel outPanel = new JPanel();
        outPanel.setLayout(new BorderLayout());
        outPanel.add(new JLabel("View"), BorderLayout.CENTER);
        outField = new JTextArea(25, 25);
        outField.setEditable(false);
        JScrollPane sp = new JScrollPane(outField);
        outPanel.add(sp, BorderLayout.CENTER);

        //creation of buttons.
        JButton addManagerButton = new JButton("Add Manager");
        addManagerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new NewManagerWindow(anEmplist);
            }
        });
        
        JButton addSalariedButton = new JButton("Add Salaried");
        addSalariedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new NewSalariedWindow(anEmplist);
            }
        });

        JButton addHourlyButton = new JButton("Add Hourly");
        addHourlyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new NewHourlyWindow(anEmplist);
            }
        });

        JButton sortByNameButton = new JButton("Sort by Name");
        sortByNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                anEmplist.sortByName();
                System.out.println("Employees now sorted alphabetically.");
            }
        });

        JButton sortBySalaryButton = new JButton("Sort by Salary");
        sortBySalaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Employees now sorted by "
                        + "salary (low to high).");
                anEmplist.sortBySalary();
            }
        });

        JButton printAllButton = new JButton("Show All");
        printAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("\n\n-------------------------------");
                System.out.println("SHOW ALL EMPLOYEES");
                System.out.println("-------------------------------\n");
                anEmplist.printAll();
                System.out.println("_______________________________"
                        + "_____\n\n");
            }
        });

        JButton printManagersButton = new JButton("Show Managers");
        printManagersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("\n\n-------------------------------");
                System.out.println("SHOW ALL MANAGERS");
                System.out.println("-------------------------------\n");
                anEmplist.printManagers();
                System.out.println("_______________________________"
                        + "_____\n\n");
            }
        });

        JButton printSalariedButton = new JButton("Show Salaried");
        printSalariedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("\n\n-------------------------------");
                System.out.println("SHOW ALL SALARIED EMPLOYEES");
                System.out.println("-------------------------------\n");
                anEmplist.printSalaried();
                System.out.println("_______________________________"
                        + "_____\n\n");
            }
        });

        JButton printHourlyButton = new JButton("Show Hourly");
        printHourlyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("\n\n-------------------------------");
                System.out.println("SHOW ALL HOURLY EMPLOYEES");
                System.out.println("-------------------------------\n");
                anEmplist.printHourly();
                System.out.println("_______________________________"
                        + "_____\n\n");
            }
        });

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                anEmplist.save();
            }
        });

        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                anEmplist.load();
            }
        });

        JButton editOvertimeRateButton = new JButton("Edit Overtime Rate");
        editOvertimeRateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new NewOvertimeRateWindow(anEmplist);
            }
        });

        JButton editHourlyRateButton = new JButton("Edit Hourly Rate");
        editHourlyRateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new NewHourlyRateWindow(anEmplist);
            }
        });

        //set text color of buttons for aesthetic purposes.
        addManagerButton.setForeground(Color.RED);
        addSalariedButton.setForeground(Color.RED);
        addHourlyButton.setForeground(Color.RED);

        loadButton.setForeground(Color.BLUE);
        saveButton.setForeground(Color.BLUE);

        printAllButton.setForeground(Color.MAGENTA);
        printManagersButton.setForeground(Color.MAGENTA);
        printSalariedButton.setForeground(Color.MAGENTA);
        printHourlyButton.setForeground(Color.MAGENTA);
        
        sortByNameButton.setForeground(Color.GRAY);
        sortBySalaryButton.setForeground(Color.GRAY);

        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(3, 5, -10, 5);
        
        buttonPanel.setLayout(grid);
        
        //first row of buttons
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(sortByNameButton);
        buttonPanel.add(sortBySalaryButton);
        //adds blanks space for aesthetic purposes
        buttonPanel.add(new JLabel("")); 
        
        //second row of buttons
        buttonPanel.add(printAllButton);
        buttonPanel.add(printManagersButton);
        buttonPanel.add(printSalariedButton);
        buttonPanel.add(printHourlyButton);
        //adds blanks space for aesthetic purposes
        buttonPanel.add(new JLabel(""));
        
        //third row of buttons
        buttonPanel.add(addManagerButton);
        buttonPanel.add(addSalariedButton);
        buttonPanel.add(addHourlyButton);
        buttonPanel.add(editOvertimeRateButton);
        buttonPanel.add(editHourlyRateButton);

        //Create and show frame.
        JFrame frame = new JFrame("Employee Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(outPanel, BorderLayout.SOUTH);
        frame.add(buttonPanel, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }

}
