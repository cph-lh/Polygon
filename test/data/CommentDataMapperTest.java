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
public class CommentDataMapperTest {
    
    public CommentDataMapperTest()
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
     * Test of createComment method, of class CommentDataMapper.
     */
    @Test
    public void testCreateComment()
    {
        System.out.println("createComment");
        int bID = 1001;
        String bOutsideC = "";
        String roofC = "";
        String outerWallsC = "";
        String wallsC = "";
        String celingC = "";
        String floorC = "";
        String windows_doorsC = "";
        CommentDataMapper instance = new CommentDataMapper();
        instance.createComment(bID, bOutsideC, roofC, outerWallsC, wallsC, celingC, floorC, windows_doorsC);
       
    }

    /**
     * Test of updateCommentColumn method, of class CommentDataMapper.
     */
    @Test
    public void testUpdateCommentColumn()
    {
        System.out.println("updateCommentColumn");
        int bID = 0;
        String column = "";
        String comment = "";
        CommentDataMapper instance = new CommentDataMapper();
        instance.updateCommentColumn(bID, column, comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
