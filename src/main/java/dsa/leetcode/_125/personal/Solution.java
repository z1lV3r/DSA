package dsa.leetcode._125.personal;

public class Solution {

    public boolean isPalindrome(String s) {
        for(int i=0, j=s.length()-1; i<j; i++, j--) {
            char l = s.charAt(i);
            char r = s.charAt(j);

            while(i<j && !Character.isLetterOrDigit(l)) {
                l = s.charAt(++i);
            }

            while(i<j && !Character.isLetterOrDigit(r)) {
                r = s.charAt(--j);
            }

            if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }
        }
        return true;
    }
}
