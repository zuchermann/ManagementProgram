package ManagementProgram;

/**
 * Class for representing a list of employees.
 * @author zacharykondak
 */
import java.awt.FileDialog;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Emplist {

    /**
     * empList is an ArrayList of Employees.
    */
    private ArrayList<Employee> empList;

    /**
    *This constructs a new Emplist;
    *Initializes empList to be empty.
    */
    Emplist() {
        this.empList = new ArrayList<Employee>();
    }

    /**
     * Constructs a new Emplist given anEmplist.
     * @param anEmplist the new value of empList.
     */
    private Emplist(ArrayList<Employee> anEmplist) {
        this.empList = anEmplist;
    }

    /**
     * Adds a new employee to empList.
     * @param employee the employee to be added to empList.
     */
    public void add(Employee employee) {
        this.empList.add(employee);
    }

    /**
     * Sorts empList alphabetically by name through the use of a comparator.
     */
    public void sortByName() {
        Comparator<Employee> comp = new EmployeeComparatorByName();
        Collections.sort(this.empList, comp);
    }

    /**
     * Sorts empList by salary in ascending 
     * order through the use of a comparator.
     */
    public void sortBySalary() {
        Comparator<Employee> comp = new EmployeeComparatorBySalary();
        Collections.sort(this.empList, comp);
    }

    /**
     * Prints all fields of all the employees contained within empList.
     */
    public void printAll() {
        for (Employee e : this.empList) {
            System.out.println(e);
        }
    }

    /**
     * Prints all fields of all the managers contained within empList.
     */
    public void printManagers() {
        for (Employee e : this.empList) {
            if (e.getClass() == Manager.class) {
                System.out.println(e);
            }
        }
    }

    /**
     * Prints all fields of all the salaried employees contained within empList.
     */
    public void printSalaried() {
        for (Employee e : this.empList) {
            if (e.getClass() == Salaried.class) {
                System.out.println(e);
            }
        }
    }

    /**
     * Prints all fields of all the hourly employees contained within empList.
     */
    public void printHourly() {
        for (Employee e : this.empList) {
            if (e.getClass() == Hourly.class) {
                System.out.println(e);
            }
        }
    }

    /**
     * Sets the overtime rates of all salaried
     * employees contained within empList.
     * @param overtimeRate the new overtime rate to be set.
     */
    public void setOvertimeRates(double overtimeRate) {
        for (Employee e : this.empList) {
            if (e.getClass() == Salaried.class) {
                ((Salaried) e).setOvertimeRate(overtimeRate);
            }
        }
    }

    /**
     * Sets the hourly rates of all hourly
     * employees contained within empList.
     * @param hourlyRate the new hourly rate to be set.
     */
    public void setHourlyRates(double hourlyRate) {
        for (Employee e : this.empList) {
            if (e.getClass() == Hourly.class) {
                ((Hourly) e).setHourlyRate(hourlyRate);
            }
        }
    }

    /**
     * Saves the value of empList.
     */
    public void save() {
        //opens the save dialogue window.
        FileDialog fd = new FileDialog((java.awt.Frame) null,
                "Save", FileDialog.SAVE);
        fd.setVisible(true);
        String fileName = fd.getFile();
        String fileLocation = fd.getDirectory();
        //streams out the value of empList to destination.
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileLocation + fileName + ".ser"))) {
            out.writeObject(this.empList);
            out.flush();
            //this is so an exception is thrown when user hits cancel.
            fileName.length();
            System.out.println("File successfully saved.");
        } catch (Exception e) {
            System.err.println("No file saved.");
        }
    }

    /**
     * loads a new ArrayList of employees from a .ser file into empList field.
     */
    public void load() {
        //opens the load dialogue window.
        FileDialog fd = new FileDialog((java.awt.Frame) null,
                "Load", FileDialog.LOAD);
        fd.setVisible(true);
        String fileName = fd.getFile();
        String fileLocation = fd.getDirectory();
        //streams in a .ser file into this.empList
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(fileLocation + fileName))) {
            ArrayList<Employee> anEmplist = 
                    (ArrayList<Employee>) in.readObject();
            in.close();
            System.out.println("File successfully loaded.");
             this.empList = anEmplist;
        } catch (Exception e) {
            System.err.println("No file loaded.");
        }
    }

}
