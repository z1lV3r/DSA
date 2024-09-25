package dsa.leetcode._206.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        Solution.ListNode result = solution.reverseList(getList(new int[] {1,2,3,4,5}));
        assertTrue(equals(
                getList(new int[] {5,4,3,2,1}),
                result));
    }

    @Test
    public void case2() {
        Solution.ListNode result = solution.reverseList(getList(new int[] {1,2}));
        assertTrue(equals(
                getList(new int[] {2,1}),
                result));
    }

    @Test
    public void case3() {
        Solution.ListNode result = solution.reverseList(null);
        assertTrue(equals(null, result));
    }

    private Solution.ListNode getList(int[] values) {
        Solution.ListNode head = new Solution.ListNode(values[0]);
        Solution.ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Solution.ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private boolean equals(Solution.ListNode list1, Solution.ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }
}
