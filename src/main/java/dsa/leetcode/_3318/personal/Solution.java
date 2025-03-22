package dsa.leetcode._3318.personal;

import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length-k + 1];
        //Get sub-array k-1
        for(int i=0; i<result.length; i++) {
            result[i] = getSum(nums, i, i+k, x);
        }
        return result;
    }

    private int getSum(int[] nums, int initialIdx, int finalIdx, int topX) {
        int sum = 0;
        Map<Integer, Integer> mappedNums = getMappedNums(nums,initialIdx,finalIdx);
        Queue<Map.Entry<Integer, Integer>> orderedMappedNums = orderMappedNums(mappedNums);

        for(int i=0; i<topX; i++) {
            Map.Entry<Integer, Integer> entry = orderedMappedNums.poll();
            if(entry != null) {
                sum += entry.getKey() * entry.getValue();
            }
        }

        return sum;
    }

    private Queue<Map.Entry<Integer, Integer>> orderMappedNums(Map<Integer, Integer> mappedNums) {
        Queue<Map.Entry<Integer, Integer>> orderedMappedNums = new PriorityQueue<>(
                (entry1, entry2) ->
                    entry2.getValue() != entry1.getValue() ? entry2.getValue() - entry1.getValue() : entry2.getKey() - entry1.getKey());
        orderedMappedNums.addAll(mappedNums.entrySet());
        return orderedMappedNums;
    }

    private Map<Integer, Integer> getMappedNums(int[] nums, int initialIdx, int finalIdx) {
        Map<Integer, Integer> mappedNums = new HashMap<>();
        for(int i=initialIdx; i<finalIdx; i++) {
            int occurrence = 0;
            if(mappedNums.containsKey(nums[i])) {
                occurrence = mappedNums.get(nums[i]);
            }
            occurrence++;
            mappedNums.put(nums[i], occurrence);
        }
        return mappedNums;
    }
}