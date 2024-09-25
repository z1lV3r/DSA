package dsa.leetcode._704.binary.search;

public class Solution {

    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, m;
        while(l <= r) {
            m=(l+r)/2;
            int num = nums[m];
            if(num == target) {
                return m;
            } else if(num > target) {
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return -1;
    }
}