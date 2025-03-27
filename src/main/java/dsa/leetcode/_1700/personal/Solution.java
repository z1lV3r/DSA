package dsa.leetcode._1700.personal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = getStudentsQueue(students);
        Stack<Integer> sandwichesStack = getSandwichesStack(sandwiches);


        while(!studentsQueue.isEmpty() && studentsQueue.contains(sandwichesStack.peek())) {
            int student = studentsQueue.poll();
            if(student == sandwichesStack.peek()) {
                sandwichesStack.pop();
            } else {
                studentsQueue.offer(student);
            }
        }

        return studentsQueue.size();
    }

    private Queue<Integer> getStudentsQueue(int[] students) {
        Queue<Integer> result = new LinkedList<>();
        for(int i=students.length-1; i>=0; i--) {
            result.offer(students[i]);
        }
        return result;
    }

    private Stack<Integer> getSandwichesStack(int[] sandwiches) {
        Stack<Integer> result = new Stack<>();
        for(int i=sandwiches.length-1; i>=0; i--) {
            result.push(sandwiches[i]);
        }
        return result;
    }
}
