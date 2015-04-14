

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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of setBonus method, of class Manager.
     */
    @Test
    public void testSetBonus() {
        System.out.println("setBonus");
        double bonus = 3000;
        Manager instance = new Manager ("Sal", 56000, 10);
        instance.setBonus(bonus);
        System.out.println(instance);
        instance.setBonus(2000);
        System.out.println(instance);
    }

    /**
     * Test of getSalary method, of class Manager.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Manager instance = new Manager("okay", 0, 0);
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        Manager instance2 = new Manager("okay", 50000, 50000);
        expResult = 100000;
        result = instance2.getSalary();
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of toString method, of class Manager.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Manager("fred", 0, 0);
        String expResult = "MANAGER EMPLOYEE:\n" +
                "Name: " + "fred" +
                ". Salary (raw): $" + "0.0" +
                ". Bonus: " + "0.0" + ".\n" +
                "Salary (with bonus) = $" + "0.0" +
                ".\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
