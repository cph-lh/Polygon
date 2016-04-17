package data;

import data.*;
import domain.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CustomerDataMapperTest {

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
    
    @Test
    public void testAddCustomer()
    {
        System.out.println("addCustomer");
        int id = 4444;
        String name = "unitTest";
        String address = "UnitTest12";
        int zip = 2300;
        int phone = 12345678;
        String password = "1234";
        CustomerDataMapper instance = new CustomerDataMapper();
        instance.addCustomer(id, name, address, zip, phone, password);

    }

    /**
     * Test of getCustomer method, of class DM_Customer.
     */
    @Test
    public void testGetCustomer()
    {
        System.out.println("getCustomer");
        int cID = 4444;
        CustomerDataMapper instance = new CustomerDataMapper();
        //Customer expResult = null;
        String expName = "unitTest";
        Customer result = instance.getCustomer(cID);
        assertEquals(expName, result.getName());
        //assertEquals(expResult, result);
    }

    /**
     * Test of deleteCustomer method, of class DM_Customer.
     */
    
    @Test(expected = NullPointerException.class)
    public void testDeleteCustomer()
    {
        System.out.println("deleteCustomer");
        int cID = 4444;
        String expName = "unitTest";
        CustomerDataMapper instance = new CustomerDataMapper();
        instance.deleteCustomer(cID);
        Customer result = instance.getCustomer(cID);
        assertEquals(expName, result.getName());

    }

}
