package ManagementProgram;


/**
 * Class to represent an hourly employee.
 * @author zacharykondak
 */
public class Hourly extends Employee{
    
    /**
     * The employee's hours.
     */
    private double hours; 
    /**
     * The employee's hourly rate of pay.
     */
    private double hourlyRate;
    
    /**
     * Constructs a new hourly employee.
     * @param name the name of the employee.
     * @param hours the hours of the employee.
     * @param hourlyRate the hourly rate of the employee.
     */
    Hourly(String name, double hours, double hourlyRate) {
        this.name = name;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }
    
    /**
     * Sets the hours field.
     * @param hours the new value for hours to be set.
     */
    public void setHours(double hours) {
        this.hours = hours;
    }
    
    /**
     * Sets the hourlyRate field.
     * @param hourlyRate the new value for hourlyRate to be set.
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
    /**
     * Calculates the salary given the hours and hourlyRate.
     * @return the salary of the employee.
     */
    @Override
    public double getSalary() {
        return this.hourlyRate * this.hours;
    }
    
    /**
     * Returns a string that contains information about the employee.
     * @return information about the employee.
     */
    @Override
    public String toString() {
        return 
                "HOURLY EMPLOYEE:\n" +
                "Name: " + this.name +
                ". Salary (raw): $" + this.salary +
                ". Hours: " + this.hours + 
                ". Hourly rate: " + this.hourlyRate + ".\n" +
                "Salary (calculated) = $" + this.getSalary() +
                ".\n";
    }
    
}
