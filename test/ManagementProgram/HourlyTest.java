
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
public class HourlyTest {
    
    public HourlyTest() {
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
     * Test of setHours method, of class Hourly.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        double hours = 0.0;
        Hourly instance = new Hourly("Sal", 1920, 15.5);
        instance.setHours(hours);
        System.out.println(instance);
        instance.setHours(2000);
        System.out.println(instance);
    }

    /**
     * Test of setHourlyRate method, of class Hourly.
     */
    @Test
    public void testSetHourlyRate() {
        System.out.println("setHourlyRate");
        double hourlyRate = 0.0;
        Hourly instance = new Hourly("Sal", 1920, 15.5);
        instance.setHourlyRate(hourlyRate);
        System.out.println(instance);
        instance.setHourlyRate(20);
        System.out.println(instance);
    }

    /**
     * Test of getSalary method, of class Hourly.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Hourly instance = new Hourly("okay", 0, 0);
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        Hourly instance2 = new Hourly("okay", 1840, 12.5);
        expResult = 1840 * 12.5;
        result = instance2.getSalary();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of toString method, of class Hourly.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Hourly("fred", 0, 0);
        String expResult = "HOURLY EMPLOYEE:\n" +
                "Name: " + "fred" +
                ". Salary (raw): $" + "0.0" +
                ". Hours: " + "0.0" + 
                ". Hourly rate: " + "0.0" + ".\n" +
                "Salary (calculated) = $" + "0.0" +
                ".\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
