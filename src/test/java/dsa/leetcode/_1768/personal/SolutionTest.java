package dsa.leetcode._1768.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();
    private String word1;
    private String word2;

    @Test
    public void case1() {
        word1 = "abc";
        word2 = "pqr";
        String result = solution.mergeAlternately(word1, word2);
        assertEquals("apbqcr", result);
    }

    @Test
    public void case2() {
        word1 = "ab";
        word2 = "pqrs";
        String result = solution.mergeAlternately(word1, word2);
        assertEquals("apbqrs", result);
    }

    @Test
    public void case3() {
        word1 = "abcd";
        word2 = "pq";
        String result = solution.mergeAlternately(word1, word2);
        assertEquals("apbqcd", result);
    }
}
