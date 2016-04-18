package data;

import data.*;
import domain.*;
import java.util.ArrayList;
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
    public void test3AddCustomer()
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
    public void test2GetCustomer()
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
    public void test1DeleteCustomer()
    {
        System.out.println("deleteCustomer");
        int cID = 4444;
        String expName = "unitTest";
        CustomerDataMapper instance = new CustomerDataMapper();
        instance.deleteCustomer(cID);
        Customer result = instance.getCustomer(cID);
        assertEquals(expName, result.getName());

    }

    /**
     * Test of addCustomer method, of class CustomerDataMapper.
     */
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
     * Test of getCustomer method, of class CustomerDataMapper.
     */
    @Test
    public void testGetCustomer()
    {
        System.out.println("getCustomer");
        int cID = 0;
        CustomerDataMapper instance = new CustomerDataMapper();
        Customer expResult = null;
        Customer result = instance.getCustomer(cID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerDataMapper.
     */
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

    /**
     * Test of viewCustomers method, of class CustomerDataMapper.
     */
    @Test
    public void testViewCustomers()
    {
        System.out.println("viewCustomers");
        CustomerDataMapper instance = new CustomerDataMapper();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.viewCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
