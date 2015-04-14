

package ManagementProgram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author zacharykondak
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ManagementProgram.ManagerTest.class, ManagementProgram.EmployeeComparatorBySalaryTest.class, ManagementProgram.EmployeeTest.class, ManagementProgram.SalariedTest.class, ManagementProgram.EmplistTest.class, ManagementProgram.HourlyTest.class, ManagementProgram.EmployeeComparatorByNameTest.class})
public class ManagementProgramSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
