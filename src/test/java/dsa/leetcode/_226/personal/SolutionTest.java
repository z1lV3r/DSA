package dsa.leetcode._226.personal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        Solution.TreeNode root = new Solution.TreeNode(4);
        root.left = new Solution.TreeNode(2);
        root.left.left = new Solution.TreeNode(1);
        root.left.right = new Solution.TreeNode(3);

        root.right = new Solution.TreeNode(7);
        root.right.left = new Solution.TreeNode(6);
        root.right.right = new Solution.TreeNode(9);

        Solution.TreeNode result = solution.invertTree(root);

        Solution.TreeNode expected = new Solution.TreeNode(4);
        expected.left = new Solution.TreeNode(7);
        expected.left.left = new Solution.TreeNode(9);
        expected.left.right = new Solution.TreeNode(6);

        expected.right = new Solution.TreeNode(2);
        expected.right.left = new Solution.TreeNode(3);
        expected.right.right = new Solution.TreeNode(1);

        assertTrue(equals(expected, result));
    }

    @Test
    public void case2() {
        Solution.TreeNode root = new Solution.TreeNode(2);
        root.left = new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(3);

        Solution.TreeNode result = solution.invertTree(root);

        Solution.TreeNode expected = new Solution.TreeNode(2);
        expected.left = new Solution.TreeNode(3);
        expected.right = new Solution.TreeNode(1);

        assertTrue(equals(expected, result));
    }

    @Test
    public void case3() {
        Solution.TreeNode result = solution.invertTree(null);
        assertTrue(equals(null, result));
    }

    private boolean equals(Solution.TreeNode tree1, Solution.TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        if (tree1.val != tree2.val) {
            return false;
        }

        return equals(tree1.left, tree2.left) && equals(tree1.right, tree2.right);
    }
}
