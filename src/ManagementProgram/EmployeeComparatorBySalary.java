

package ManagementProgram;

/**
 * Strategy class used to compare two employees by salary.
 * @author zacharykondak
 */

 import java.util.*;
 
 public class EmployeeComparatorBySalary implements Comparator<Employee>
 {
    @Override
    public int compare(Employee employee1, Employee employee2)
    {
       if (employee1.getSalary() < employee2.getSalary())
           return -1;
       if (employee1.getSalary() > employee2.getSalary())
           return 1;
       return 0;
    }
 
 }
