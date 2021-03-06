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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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

   
    @Test
    public void aTestAddCustomer()
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

    
    @Test
    public void bTestGetCustomer()
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

   
    @Test(expected = NullPointerException.class)
    public void cTestDeleteCustomer()
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
