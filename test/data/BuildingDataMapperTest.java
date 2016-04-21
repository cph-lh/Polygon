/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Building;
import java.io.InputStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jmach
 */
public class BuildingDataMapperTest {
    
    public BuildingDataMapperTest()
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
     * Test of addBuilding method, of class BuildingDataMapper.
     */
    @Test
    public void testAddBuilding()
    {
        System.out.println("addBuilding");
        int id = 0;
        String name = "";
        String address = "";
        int zip = 0;
        int parcel = 0;
        int size = 0;
        int floors = 0;
        int year = 0;
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.addBuilding(id, name, address, zip, parcel, size, floors, year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBuilding method, of class BuildingDataMapper.
     */
    @Test
    public void testDeleteBuilding()
    {
        System.out.println("deleteBuilding");
        int bID = 0;
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.deleteBuilding(bID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllBuildings method, of class BuildingDataMapper.
     */
    @Test
    public void testDeleteAllBuildings()
    {
        System.out.println("deleteAllBuildings");
        int cID = 0;
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.deleteAllBuildings(cID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewBuildings method, of class BuildingDataMapper.
     */
    @Test
    public void testViewBuildings()
    {
        System.out.println("viewBuildings");
        int cID = 0;
        BuildingDataMapper instance = new BuildingDataMapper();
        ArrayList<Building> expResult = null;
        ArrayList<Building> result = instance.viewBuildings(cID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFloorPlan method, of class BuildingDataMapper.
     */
    @Test
    public void testAddFloorPlan()
    {
        System.out.println("addFloorPlan");
        int bID = 0;
        InputStream input = null;
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.addFloorPlan(bID, input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFloorPlan method, of class BuildingDataMapper.
     */
    @Test
    public void testGetFloorPlan()
    {
        System.out.println("getFloorPlan");
        int bID = 0;
        BuildingDataMapper instance = new BuildingDataMapper();
        InputStream expResult = null;
        InputStream result = instance.getFloorPlan(bID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class BuildingDataMapper.
     */
    @Test
    public void testSetStatus()
    {
        System.out.println("setStatus");
        int bID = 1000;
        int status = 1;
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.setStatus(bID, status);
        
    }

    /**
     * Test of addUsage method, of class BuildingDataMapper.
     */
    @Test
    public void testAddUsage()
    {
        System.out.println("addUsage");
        int bID = 1000;
        String bUsage = "lager";
        BuildingDataMapper instance = new BuildingDataMapper();
        instance.addUsage(bID, bUsage);
        
    }
    
}
