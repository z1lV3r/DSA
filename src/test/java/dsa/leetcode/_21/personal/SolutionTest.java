package dsa.leetcode._21.personal;

import dsa.leetcode._21.personal.Solution.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        ListNode result = solution.mergeTwoLists(getList(new int[]{1,2,4}), getList(new int[]{1,3,4}));
        assertTrue(equals(getList(new int[]{1,1,2,3,4,4}), result));
    }

    @Test
    public void case2() {
        ListNode result = solution.mergeTwoLists(null, null);
        assertTrue(equals(null, result));
    }

    @Test
    public void case3() {
        ListNode result = solution.mergeTwoLists(null, getList(new int[]{0}));
        assertTrue(equals(getList(new int[]{0}), result));
    }

    private ListNode getList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private boolean equals(ListNode list1, ListNode list2) {
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
