

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest2 {
    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertFalse(Palindrome.isPalindrome("abracadabra"));
    }
}
