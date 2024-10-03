package dsa.leetcode._1.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {

    private final Solution solution = new Solution();
    private int[] nums;

    @Test
    public void case1() {
        nums = new int[] {2,7,11,15};
        int[] result = solution.twoSum(nums, 9);
        assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    public void case2() {
        nums = new int[] {3,2,4};
        int[] result = solution.twoSum(nums, 6);
        assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    public void case3() {
        nums = new int[] {3,3};
        int[] result = solution.twoSum(nums, 6);
        assertArrayEquals(new int[]{0,1}, result);
    }

}
