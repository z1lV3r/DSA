package dsa.leetcode._217.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private int[] nums;

    @Test
    public void case1() {
        nums = new int[] {1,2,3,1};
        boolean result = solution.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void case2() {
        nums = new int[] {1,2,3,4};
        boolean result = solution.containsDuplicate(nums);
        assertFalse(result);
    }

    @Test
    public void case3() {
        nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        boolean result = solution.containsDuplicate(nums);
        assertTrue(result);
    }
}
