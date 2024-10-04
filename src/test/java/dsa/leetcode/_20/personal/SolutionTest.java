package dsa.leetcode._20.personal;

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
        s = "()";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }

    @Test
    public void case2() {
        s = "()[]{}";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }

    @Test
    public void case3() {
        s = "(]";
        boolean result = solution.isValid(s);
        assertFalse(result);
    }

    @Test
    public void case4() {
        s = "([])";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }
}
