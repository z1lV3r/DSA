package dsa.leetcode._1.personal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] solution = {};

        Map<Integer, Integer> complements = new HashMap<>();
        complements.put(nums[0], 0);

        for(int i=1; i<nums.length; i++) {
            int complement = target - nums[i];

            if(complements.containsKey(complement)) {
                solution = new int[] {complements.get(complement), i};
                break;
            }
            complements.put(nums[i], i);
        }

        return solution;
    }
}
