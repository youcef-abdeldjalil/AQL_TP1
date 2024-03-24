package LineCoverageTest;


import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exo4Test {

    @Test
    public void Test(){
        double[] result = QuadraticEquation.solve(1, 2, 1);

        // Print the values of the array
        for (double value : result) {
            System.out.println(value);
        }
    }

    @Test
    public void testSolveWithZeroA() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 1, 1); // Should throw IllegalArgumentException
        });
    }
    @Test
    public void testSolveWhenDeltaIsNegative() {
        double[] result = QuadraticEquation.solve(1, 1, 1);
        assertNull(result);
    }

    @Test
    public void testSolveWhenDeltaIsPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, result, 0.0001);
    }
}
