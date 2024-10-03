package dsa.leetcode._217.personal;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int num : nums) {
            unique.add(num);
        }
        return nums.length > unique.size();
    }

}
