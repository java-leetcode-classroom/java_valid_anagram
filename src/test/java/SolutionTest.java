import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution sol = new Solution();
    @Test
    void isAnagramExample1() {
        assertTrue(sol.isAnagram("anagram", "nagaram"));
    }
    @Test
    void isAnagramExample2() {
        assertFalse(sol.isAnagram("rat", "cat"));
    }
}