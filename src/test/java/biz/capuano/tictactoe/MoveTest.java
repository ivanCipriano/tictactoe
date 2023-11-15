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
public class MoveTest {
    Move move;
    
    public MoveTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        move=new Move(5,4);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRow method, of class Move.
     */
    @Test
    public void testGetRow() {
        System.out.println("Test getRow");
        assertEquals(5, move.getRow());
    }

    /**
     * Test of getCol method, of class Move.
     */
    @Test
    public void testGetCol() {
        System.out.println("Test getCol");
        assertEquals(4, move.getCol());
    }
    
}
