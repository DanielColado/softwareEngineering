package source;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel
 */
public class JUnitTestFibonacciTest {

    public JUnitTestFibonacciTest() {
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

    @Test
    public void nEqualTenShouldOutput0112358132134() {
        MathFunctions instance = new MathFunctions();
        String desired = "0 1 1 2 3 5 8 13 21 34 ";
        var result = instance.generateFibonacci(10);
        assertEquals(desired, result);
    }

    @Test
    public void testFibonacciWithNegativeNumberShouldBeInvalid() {
        MathFunctions instance = new MathFunctions();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.generateFibonacci(-5);
        });
    }

}
