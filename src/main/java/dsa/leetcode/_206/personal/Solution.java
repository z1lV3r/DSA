package dsa.leetcode._206.personal;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static class ListNode {
      int val;
      ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
