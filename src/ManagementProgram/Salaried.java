package ManagementProgram;


/**
 * Class to represent a salaried employee.
 * @author zacharykondak
 */
public class Salaried extends Employee{
    
    /**
     * the overtime hours of the employee.
     */
    private double overtimeHours;
    /**
     * the overtime rate of pay for the employee.
     */
    private double overtimeRate;
    
    /**
     * constructs a new salaried employee.
     * @param name the name of the employee.
     * @param salary the raw salary of the employee.
     * @param overtimeHours the overtime hours of the employee.
     * @param overtimeRate  the overtime rate of the employee.
     */
    Salaried(String name, double salary,
            double overtimeHours, double overtimeRate) {
        this.name = name;
        this.salary = salary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    
    /**
     * set the overtime hours of the employee.
     * @param overtimeHours the value for overtimeHours to be set.
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
    /**
     * set the overtime rate of the employee.
     * @param overtimeRate  the value for overtimeRate to be set.
     */
    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    
    /**
     * calculates and returns the value for the employee's salary.
     * @return calculated salary.
     */
    @Override
    public double getSalary() {
        return this.salary + (this.overtimeHours * this.overtimeRate);
    }
    
    /**
     * returns a string that contains some information about the salaried employee.
     * @return information about the salaried employee.
     */
    @Override
    public String toString() {
        return "SALARIED EMPLOYEE:\n" +
                "Name: " + this.name +
                ". Salary (raw): $" + this.salary +
                ". Overtime hours: " + this.overtimeHours + 
                ". Overtime rate: " + this.overtimeRate + ".\n" +
                "Salary (calculated) = $" + this.getSalary() +
                ".\n";
    }
    
}
