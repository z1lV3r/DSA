package dsa.leetcode._242.personal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            Integer valS = mapS.get(charS);
            Integer valT = mapT.get(charT);

            mapS.put(charS, valS != null ? ++valS : 1);
            mapT.put(charT, valT != null ? ++valT : 1);
        }

        for(Map.Entry<Character, Integer> entryS : mapS.entrySet()) {
            Integer valT = mapT.get(entryS.getKey());
            if(!entryS.getValue().equals(valT)) {
                return false;
            }
        }

        return true;
    }
}
