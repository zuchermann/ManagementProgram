

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
public class SalariedTest {
    
    public SalariedTest() {
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
     * Test of setOvertimeHours method, of class Salaried.
     */
    @Test
    public void testSetOvertimeHours() {
        System.out.println("setOvertimeHours");
        double overtimeHours = 0.0;
        Salaried instance = new Salaried("Sal", 25000, 200, 15.5);
        instance.setOvertimeHours(overtimeHours);
        System.out.println(instance);
        instance.setOvertimeHours(300);
        System.out.println(instance);
    }

    /**
     * Test of setOvertimeRate method, of class Salaried.
     */
    @Test
    public void testSetOvertimeRate() {
        System.out.println("setOvertimeRate");
        double overtimeRate = 0.0;
        Salaried instance = new Salaried("Sal", 25000, 300, 15);
        instance.setOvertimeRate(overtimeRate);
        System.out.println(instance);
        instance.setOvertimeRate(20);
        System.out.println(instance);
    }

    /**
     * Test of getSalary method, of class Salaried.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Salaried instance = new Salaried("okay", 0, 0, 0);
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        Salaried instance2 = new Salaried("okay", 50000, 250, 23);
        expResult = 50000 + (250 * 23);
        result = instance2.getSalary();
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of toString method, of class Salaried.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Salaried("fred", 0, 0, 0);
        String expResult = "SALARIED EMPLOYEE:\n" +
                "Name: " + "fred" +
                ". Salary (raw): $" + "0.0" +
                ". Overtime hours: " + "0.0" + 
                ". Overtime rate: " + "0.0" + ".\n" +
                "Salary (calculated) = $" + "0.0" +
                ".\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
