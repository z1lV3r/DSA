package dsa.leetcode._125.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private String s;

    @Test
    public void case1() {
        s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    public void case2() {
        s = "race a car";
        boolean result = solution.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    public void case3() {
        s = " ";
        boolean result = solution.isPalindrome(s);
        assertTrue(result);
    }
}
