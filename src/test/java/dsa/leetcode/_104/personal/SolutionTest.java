package dsa.leetcode._104.personal;

import dsa.leetcode._104.personal.Solution.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = solution.maxDepth(root);
        assertEquals(3, result);
    }

    @Test
    public void case2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        int result = solution.maxDepth(root);
        assertEquals(2, result);
    }

    @Test
    public void case3() {
        TreeNode root = new TreeNode(21);
        int result = solution.maxDepth(root);
        assertEquals(1, result);
    }

    @Test
    public void case4() {
        int result = solution.maxDepth(null);
        assertEquals(0, result);
    }
}
