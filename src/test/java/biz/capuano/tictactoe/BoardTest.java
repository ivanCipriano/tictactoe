/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package biz.capuano.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cipri
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of print method, of class Board.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Board instance = new Board();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidMove method, of class Board.
     */
    @Test
    public void testIsValidMove() {
        System.out.println("isValidMove");
        Move move = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isValidMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        Move move = null;
        char mark = ' ';
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.makeMove(move, mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class Board.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkForWin method, of class Board.
     */
    @Test
    public void testCheckForWin() {
        System.out.println("checkForWin");
        char mark = ' ';
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.checkForWin(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
