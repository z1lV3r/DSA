package dsa.leetcode._703.queue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class KthLargestTest {
    private KthLargest kthLargest;

    @Test
    public void case1() {
        int result;
        kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

        result = kthLargest.add(3);
        assertEquals(4, result);

        result = kthLargest.add(5);
        assertEquals(5, result);

        result = kthLargest.add(10);
        assertEquals(5, result);

        result = kthLargest.add(9);
        assertEquals(8, result);

        result = kthLargest.add(4);
        assertEquals(8, result);
    }

    @Test
    public void case2() {
        int result;
        kthLargest = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});

        result = kthLargest.add(2);
        assertEquals(7, result);

        result = kthLargest.add(10);
        assertEquals(7, result);

        result = kthLargest.add(9);
        assertEquals(7, result);

        result = kthLargest.add(9);
        assertEquals(8, result);
    }
}
