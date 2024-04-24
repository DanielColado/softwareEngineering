/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package source;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author malve
 */
public class jUnitFactorialTest {
    
    public jUnitFactorialTest() {
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
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int n = 5;
        Factorial instance = new Factorial();
        int expResult = 120;
        int result = instance.factorial(n);
        assertEquals(expResult, result);
       
    } 
    @Test
    public void testFactorialWithNegativeNumber() {
        System.out.println("testFactorialWithNegativeNumber");
        int n = -5; // Número negativo
        Factorial instance = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.factorial(n);
        });
    }
}
    

