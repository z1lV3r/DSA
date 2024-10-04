package dsa.leetcode._20.personal;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            if (isOpen(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character last = stack.pop();
                if (!isValid(last, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(Character c) {
        return c.equals('(') || c.equals('{') || c.equals('[');
    }

    private boolean isValid(Character open, Character close) {
        if(open.equals('(')) {
            return close.equals(')');

        } else if(open.equals('[')) {
            return close.equals(']');

        } else if(open.equals('{')) {
            return close.equals('}');
        }

        return false;
    }
}