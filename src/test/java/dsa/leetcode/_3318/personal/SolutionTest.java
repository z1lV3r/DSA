package dsa.leetcode._3318.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private int[] nums;
    private int k;
    private int x;

    @Test
    public void case1() {
        nums = new int[]{1,1,2,2,3,4,2,3};
        k = 6;
        x = 2;
        int[] result = solution.findXSum(nums, k, x);
        assertArrayEquals(new int[] {6,10,12}, result);
    }

    @Test
    public void case2() {
        nums = new int[]{3,8,7,8,7,5};
        k = 2;
        x = 2;
        int[] result = solution.findXSum(nums, k, x);
        assertArrayEquals(new int[] {11,15,15,15,12}, result);
    }
}
