package source;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import source.MathFuntions;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * author Daniel
 */
@ExtendWith(MockitoExtension.class) // Add this annotation to integrate Mockito with JUnit 5
public class MockitoTestFibonacci {

    public MockitoTestFibonacci() {
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

    @Mock // Use @Mock annotation to create a mock object
    MathFuntions fibonacciMock;

    public void mockFibonacciReturnProperSequence() {
        // Stubbing behavior of the mock object
        when(fibonacciMock.generateFibonacci(10)).thenReturn("0 1 1 2 3 5 8 13 21 34 ");
        // Using the mock object in the test
        assertEquals(fibonacciMock.generateFibonacci(10), "0 1 1 2 3 5 8 13 21 34 ");

    }
}
