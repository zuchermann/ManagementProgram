package ManagementProgram;


/**
 * Class to represent a manager.
 * @author zacharykondak
 */
public class Manager extends Employee {
    
    /**
     * represents a manager's bonus.
     */
    private double bonus;
    
    /**
     * 
     * @param name a manager's name.
     * @param salary a manager's raw salary.
     * @param bonus a manager's bonus.
     */
    Manager(String name, double salary, double bonus){
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
    
    /**
     * sets a manager's bonus.
     * @param bonus new value for bonus to be set.
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    /**
     * Calculates and returns a manager's salary (raw salary + bonus).
     * @return calculated salary of a manager.
     */
    @Override
    public double getSalary() {
        return this.salary + this.bonus;
    }
    /**
     * returns a string containing information regarding a manager.
     * @return information regarding a manager.
     */
    @Override
    public String toString() {
        return "MANAGER EMPLOYEE:\n" +
                "Name: " + this.name +
                ". Salary (raw): $" + this.salary +
                ". Bonus: " + this.bonus + ".\n" +
                "Salary (with bonus) = $" + this.getSalary() +
                ".\n";
    }
    
}
