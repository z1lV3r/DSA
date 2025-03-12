package dsa.leetcode._2367.brute.force;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {

    private final Solution solution = new Solution();
    private int[] nums;
    private int diff;

    @Test
    public void case1() {
        nums = new int[]{0,1,4,6,7,10};
        diff = 3;

        int result = solution.arithmeticTriplets(nums, diff);
        assertEquals(2, result);
    }

    @Test
    public void case2() {
        nums = new int[]{4,5,6,7,8,9};
        diff = 2;

        int result = solution.arithmeticTriplets(nums, diff);
        assertEquals(2, result);
    }
}