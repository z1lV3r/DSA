package dsa.leetcode._2367.hashing;

import dsa.leetcode._2367.BaseSolution;

import java.util.HashMap;
import java.util.Map;

public class Solution implements BaseSolution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int triplets=0;
        Map<Integer,Integer> mappedNums = new HashMap(nums.length);
        for(int i=0; i<nums.length; i++) {
            mappedNums.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
            if(mappedNums.containsKey(nums[i] + diff) && mappedNums.containsKey(nums[i] + diff * 2)) {
                triplets++;
            }
        }
        return triplets;
    }
}
