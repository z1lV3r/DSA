package dsa.leetcode._2506.set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private String[] words;

    @Test
    public void case1() {
        words = new String[]{"aba","aabb","abcd","bac","aabc"};
        int result = solution.similarPairs(words);
        assertEquals(2, result);
    }

    @Test
    public void case2() {
        words = new String[]{"aabb","ab","ba"};
        int result = solution.similarPairs(words);
        assertEquals(3, result);
    }

    @Test
    public void case3() {
        words = new String[]{"nba","cba","dba"};
        int result = solution.similarPairs(words);
        assertEquals(0, result);
    }
}
