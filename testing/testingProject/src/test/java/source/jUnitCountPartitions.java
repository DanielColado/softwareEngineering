package source;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class jUnitCountPartitions {
    public jUnitCountPartitions() {
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
    public void testCountPartitions() {
        MathFuntions instance = new MathFuntions();
        assertEquals(1, instance.countPartitions(1));
        assertEquals(2, instance.countPartitions(2));
        assertEquals(3, instance.countPartitions(3));
        assertEquals(5, instance.countPartitions(4));
        assertEquals(7, instance.countPartitions(5));
        assertEquals(11, instance.countPartitions(6));
        assertEquals(15, instance.countPartitions(7));
    }
}



