

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
public class EmployeeComparatorBySalaryTest {
    
    public EmployeeComparatorBySalaryTest() {
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
     * Test of compare method, of class EmployeeComparatorBySalary.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        EmployeeComparatorBySalary instance = new EmployeeComparatorBySalary();
        Manager manager = new Manager("aaaman", 123456, 1234);
        Salaried salaried = new Salaried("BBBman", 54321, 321, 21);
        int expResult = 1;
        int result = instance.compare(manager, salaried);
        assertEquals(expResult, result);
        expResult = -1;
        result = instance.compare(salaried, manager);
        assertEquals(expResult, result);
        expResult = 0;
        result = instance.compare(salaried, salaried);
        assertEquals(expResult, result);
    }
    
}
