package dsa.leetcode._21.personal;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode currentR=result, current1 = list1, current2 = list2;

        while(current1 != null || current2 != null) {

            ListNode nextNode;

            if(current1 != null && current2 != null) {
                if(current1.val <= current2.val) {
                    nextNode = current1;
                    current1 = current1.next;
                } else {
                    nextNode = current2;
                    current2 = current2.next;
                }

            } else if (current1 != null) {
                nextNode = current1;
                current1 = current1.next;

            } else {
                nextNode = current2;
                current2 = current2.next;
            }

            currentR.next = nextNode;
            currentR=currentR.next;

        }

        return result.next;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
