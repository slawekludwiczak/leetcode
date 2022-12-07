package range_sum_of_bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int sum = solution.rangeSumBST(root, 7, 15);
        assertEquals(32, sum);
    }

    @Test
    void leetCodeTest2() {
        TreeNode tree = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(1),
                                null
                        ),
                        new TreeNode(7,
                                new TreeNode(6),
                                null
                        )
                ),
                new TreeNode(15,
                        new TreeNode(13),
                        new TreeNode(18)
                )
        );
        int sum = solution.rangeSumBST(tree, 6, 10);
        assertEquals(23, sum);
    }
}
