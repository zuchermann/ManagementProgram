

package ManagementProgram;

 import java.util.*;
 
/**
 * Strategy class used to compare two employees by name.
 * @author zacharykondak
 */
public class EmployeeComparatorByName implements Comparator<Employee>
 {
    @Override
    public int compare(Employee employee1, Employee employee2)
    {
       return employee1.getName().compareToIgnoreCase(employee2.getName());
    }
 
 }