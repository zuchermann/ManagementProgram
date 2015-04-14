

package ManagementProgram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zacharykondak
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 0.0;
        Employee instance = new Employee();
        instance.setSalary(salary);
        double expResult = 0.0;
        double result = instance.getSalary();
        assertTrue(expResult == result);
        instance.setSalary(200000);
        expResult = 200000;
        result = instance.getSalary();
        assertTrue(expResult == result);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee("",0);
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        Employee instance2 = new Employee("Jane", 1);
        expResult = "Jane";
        result = instance2.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Employee instance = new Employee();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        Employee instance2 = new Employee("Jane", 1);
        expResult = 1;
        result = instance.getSalary();
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Employee();
        String expResult = "Employee: null. Salary: $0.0.";
        String result = instance.toString();
        assertEquals(expResult, result);
        Employee instance2 = new Employee("Jane", 1);
        String expResult2 = "Employee: Jane. Salary: $1.0.";
        String result2 = instance2.toString();
        assertEquals(expResult2, result2);
    }
    
}
