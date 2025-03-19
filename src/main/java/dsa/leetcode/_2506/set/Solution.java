package dsa.leetcode._2506.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int similarPairs(String[] words) {
        int result = 0;
        List<Set<Character>> processedWords = new ArrayList<>();

        for(String word:words) {
            Set<Character> unique = new HashSet<>();
            for(char c:word.toCharArray()) {
                unique.add(c);
            }
            processedWords.add(unique);
        }

        for(int i=0; i<processedWords.size(); i++) {
            for(int j=i+1; j<processedWords.size(); j++) {
                Set<Character> first = processedWords.get(i);
                Set<Character> second = processedWords.get(j);
                if(first.size() == second.size() && first.equals(second)) {
                    result++;
                }
            }
        }
        return result;
    }
}
