package dsa.leetcode._2367.brute.force;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int i=0, j=1, k=2;
        int triplets=0;
        for(i=0; i<j; i++) {
            for(j=i+1; j<k; j++) {
                for(k=j+1; k<nums.length; k++) {
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        triplets++;
                    }
                }
            }
        }
        return triplets;
    }
}
