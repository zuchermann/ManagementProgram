package ManagementProgram;

import java.io.Serializable;


/**
 * Class for representing an employee.
 * @author zacharykondak
 */

public class Employee implements Serializable{
    
    /**
     * name of the employee.
     */
    protected String name;

    /**
     * salary of the employee.
     */
    protected double salary;
    
    /**
     * constructor creates a null Employee object.
     */
    Employee(){
        
    }
    
    /**
     * Constructs a new Employee give a name and a salary.
     * @param name name of employee.
     * @param salary salary of employee.
     */
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    /**
     * Sets the value of salary field.
     * @param salary new salary to be set.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Returns name field.
     * @return the name of the employee.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Returns salary field.
     * @return the salary of the employee.
     */
    public double getSalary() {
        return this.salary;
    }
    
    /**
     * Returns a string that contains information about the employee.
     * @return Information about the employee.
     */
    @Override
    public String toString() {
        return "Employee: " + this.name + ". Salary: $" + this.salary + ".";
    }
    

}
