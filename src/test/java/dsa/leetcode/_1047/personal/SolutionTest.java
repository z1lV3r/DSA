package dsa.leetcode._1047.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private String s;

    @Test
    public void case1() {
        s = "abbaca";
        String result = solution.removeDuplicates(s);
        assertEquals("ca", result);
    }

    @Test
    public void case2() {
        s = "azxxzy";
        String result = solution.removeDuplicates(s);
        assertEquals("ay", result);
    }
}
