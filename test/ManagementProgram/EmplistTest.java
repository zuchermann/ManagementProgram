

package ManagementProgram;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author zacharykondak
 */
public class EmplistTest {
    
    public EmplistTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Emplist.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Employee employee = null;
        Manager manager = new Manager("Jerry", 56000, 5500);
        Emplist instance = new Emplist();
        instance.add(employee);
        instance.add(manager);
    }
    
    

    /**
     * Test of sortByName method, of class Emplist.
     */
    @Test
    public void testSortByName() {
        System.out.println("sortByName");
        Emplist instance = new Emplist();
        instance.sortByName();
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        emplist.add(salaried); 
        emplist.add(salaried2); 
        instance.sortByName();
    }

    /**
     * Test of sortBySalary method, of class Emplist.
     */
    @Test
    public void testSortBySalary() {
        System.out.println("sortBySalary");
        Emplist instance = new Emplist();
        instance.sortBySalary();
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        emplist.add(salaried); 
        emplist.add(salaried2); 
        instance.sortBySalary();
    }

    /**
     * Test of printAll method, of class Emplist.
     */
    @Test
    public void testPrintAll() {
        System.out.println("printAll");
        Emplist instance = new Emplist();
        instance.printAll();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.printAll();
    }

    /**
     * Test of printManagers method, of class Emplist.
     */
    @Test
    public void testPrintManagers() {
        System.out.println("printManagers");
        Emplist instance = new Emplist();
        instance.printManagers();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.printManagers();
    }

    /**
     * Test of printSalaried method, of class Emplist.
     */
    @Test
    public void testPrintSalaried() {
        System.out.println("printSalaried");
        Emplist instance = new Emplist();
        instance.printSalaried();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.printSalaried();
    }

    /**
     * Test of printHourly method, of class Emplist.
     */
    @Test
    public void testPrintHourly() {
        System.out.println("printHourly");
        Emplist instance = new Emplist();
        instance.printHourly();
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.printHourly();
    }

    /**
     * Test of setOvertimeRates method, of class Emplist.
     */
    @Test
    public void testSetOvertimeRates() {
        System.out.println("setOvertimeRates");
        double overtimeRate = 0.0;
        Emplist instance = new Emplist();
        instance.setOvertimeRates(overtimeRate);
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.setOvertimeRates(6.66);
        instance.printAll();
    }

    /**
     * Test of setHourlyRates method, of class Emplist.
     */
    @Test
    public void testSetHourlyRates() {
        System.out.println("setHourlyRates");
        double hourlyRate = 0.0;
        Emplist instance = new Emplist();
        instance.setHourlyRates(hourlyRate);
        Salaried salaried = new Salaried("Jenny", 34500, 124, 16.25);
        Salaried salaried2 = new Salaried("Anne", 49700, 94, 21.50);
        Hourly hourly = new Hourly("Frank", 1940, 13.13);
        Hourly hourly2 = new Hourly("Zappa", 1993, 19.66);
        Manager manager = new Manager("Beta", 99999, 1);
        Manager manager2 = new Manager("Zed", 50000, 50000);
        instance.add(salaried);
        instance.add(salaried2);
        instance.add(hourly);
        instance.add(hourly2);
        instance.add(manager);
        instance.add(manager2);
        instance.setHourlyRates(6.66);
        instance.printAll();
    }
    
}
