import domain.Customer;
import domain.CustomerDataMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CustomerDataMapperTest
{
    
    public CustomerDataMapperTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of addCustomer method, of class DM_Customer.
     */
    @Ignore
    @Test
    public void testAddCustomer()
    {
        System.out.println("addCustomer");
        int id = 0;
        String name = "";
        String address = "";
        int zip = 0;
        int phone = 0;
        String password = "";
        CustomerDataMapper instance = new CustomerDataMapper();
        instance.addCustomer(id, name, address, zip, phone, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class DM_Customer.
     */
    @Test
    public void testGetCustomer()
    {
        System.out.println("getCustomer");
        int cID = 1111;
        CustomerDataMapper instance = new CustomerDataMapper();
        //Customer expResult = null;
        String expName = "TestPerson1";
        Customer result = instance.getCustomer(cID);
        assertEquals(expName, result.getName());
        //assertEquals(expResult, result);
    }

    /**
     * Test of deleteCustomer method, of class DM_Customer.
     */
    @Ignore
    @Test
    public void testDeleteCustomer()
    {
        System.out.println("deleteCustomer");
        int cID = 0;
        CustomerDataMapper instance = new CustomerDataMapper();
        instance.deleteCustomer(cID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}