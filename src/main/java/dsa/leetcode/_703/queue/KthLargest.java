package dsa.leetcode._703.queue;

import java.util.PriorityQueue;

public class KthLargest {
    private final PriorityQueue<Integer> q;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>(k);

        for(int num : nums) {
            q.offer(num);
            if(q.size() > k) {
                q.poll();
            }
        }
    }

    public int add(int val) {
        q.offer(val);
        if(q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */