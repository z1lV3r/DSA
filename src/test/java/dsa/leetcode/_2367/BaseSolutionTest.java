package dsa.leetcode._2367;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseSolutionTest {

    private final BaseSolution solution;
    private int[] nums;
    private int diff;

    protected BaseSolutionTest(BaseSolution solution) {
        this.solution = solution;
    }

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