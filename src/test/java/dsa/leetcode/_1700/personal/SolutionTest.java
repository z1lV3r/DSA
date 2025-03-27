package dsa.leetcode._1700.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private int[] students;
    private int[] sandwiches;

    @Test
    public void test1() {
        students = new int[] {1,1,0,0};
        sandwiches = new int[] {0,1,0,1};
        int result = solution.countStudents(students, sandwiches);
        assertEquals(0, result);
    }

    @Test
    public void test2() {
        students = new int[] {1,1,1,0,0,1};
        sandwiches = new int[] {1,0,0,0,1,1};
        int result = solution.countStudents(students, sandwiches);
        assertEquals(3, result);
    }
}
