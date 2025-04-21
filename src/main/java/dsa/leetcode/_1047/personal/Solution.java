package dsa.leetcode._1047.personal;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeDuplicates("abbaca");
    }
    public String removeDuplicates(String s) {

        StringBuilder builder = new StringBuilder(s);
        for(int i=1; i<builder.length(); i++) {
            if(builder.charAt(i-1) == builder.charAt(i)) {
                builder.deleteCharAt(i).deleteCharAt(i-1);
                i-=2;
                i = Math.max(i, 0);
            }
        }

        return builder.toString();
    }
}
