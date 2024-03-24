package LineCoverageTest;




import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exo2Test2 {


    @Test
    void testIsAnagram_True() {
        assertTrue(Anagram.isAnagramCorrected("listen", "silent"));
        assertTrue(Anagram.isAnagramCorrected("railsafety", "fairytales"));
        assertTrue(Anagram.isAnagramCorrected("debitcard", "badcredit"));
        assertTrue(Anagram.isAnagramCorrected("anagram", "nagaram"));
    }

    @Test
    void testIsAnagram_False() {

        assertFalse(Anagram.isAnagramCorrected("test", "tests"));
        assertFalse(Anagram.isAnagramCorrected("foo", "bar"));

    }

    @Test
    void testIsAnagram_NullStrings() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagramCorrected(null, "test"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagramCorrected("test", null));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagramCorrected(null, null));
    }



}

