/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

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
public class ReportDataMapperTest {
    
    public ReportDataMapperTest()
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
     * Test of addReportInfo method, of class ReportDataMapper.
     */
    @Test
    public void testAddReportInfo()
    {
        System.out.println("addReportInfo");
        String rDate = "20-10-2016";
        int pID = 10;
        String bResponsible = "lars";
        int bID = 1000;
        ReportDataMapper instance = new ReportDataMapper();
        instance.addReportInfo(rDate, pID, bResponsible, bID);
        
    }
    
}
