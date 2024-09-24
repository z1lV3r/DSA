package dsa.leetcode._704.binary.search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BinarySearchTest {

    private final BinarySearch algorithm = new BinarySearch();
    private int[] nums;
    private int target;

    @Test
    public void case1() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 9;

        int result = algorithm.search(nums, target);
        assertEquals(4, result);
    }

    @Test
    public void case2() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 2;

        int result = algorithm.search(nums, target);
        assertEquals(-1, result);
    }
}
