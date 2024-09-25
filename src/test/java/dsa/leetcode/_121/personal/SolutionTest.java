package dsa.leetcode._121.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {

    private final Solution solution = new Solution();
    private int[] prices;

    @Test
    public void case1() {
        prices = new int[]{7,1,5,3,6,4};
        int result = solution.maxProfit(prices);
        assertEquals(5, result);
    }

    @Test
    public void case2() {
        prices = new int[]{7,6,4,3,1};
        int result = solution.maxProfit(prices);
        assertEquals(0, result);
    }

    @Test
    public void case3() {
        prices = new int[]{7};
        int result = solution.maxProfit(prices);
        assertEquals(0, result);
    }

    @Test
    public void case4() {
        prices = new int[]{7,1,5,3,6,4,0};
        int result = solution.maxProfit(prices);
        assertEquals(5, result);
    }
}
