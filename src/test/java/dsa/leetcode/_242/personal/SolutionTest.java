package dsa.leetcode._242.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        boolean result = solution.isAnagram("anagram", "nagaram");
        assertTrue(result);
    }

    @Test
    public void case2() {
        boolean result = solution.isAnagram("rat", "car");
        assertFalse(result);
    }

    @Test
    public void case3() {
        boolean result = solution.isAnagram("aacc", "ccac");
        assertFalse(result);
    }
}
