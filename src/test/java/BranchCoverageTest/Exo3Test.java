package BranchCoverageTest;


import org.example.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exo3Test {
    private Integer[] tab; // Declare tab as a class field so it's accessible across methods

    @BeforeEach
    void setUp() {
        // Initialize the array with a specific size
        tab = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Initialize tab with values
    }

    @Test
    void Exotest() {
        // Assuming BinarySearch method is defined somewhere and returns a boolean
        assertEquals(3, BinarySearch.binarySearch_corected(tab, 3)); // Test BinarySearch method with tab array
    }


    @Test
    public void testBinarySearchWithNullArray() {
        Integer[] array = null;
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch_corected(array, 5);
        });
    }

    @Test
    void NotExictingTest (){
        assertEquals(-1, BinarySearch.binarySearch_corected(tab, 200));
    }
}
