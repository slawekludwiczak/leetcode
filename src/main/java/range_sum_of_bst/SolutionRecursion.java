package range_sum_of_bst;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionRecursion {
    public static void main(String[] args) {
        SolutionRecursion solution = new SolutionRecursion();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        System.out.println(solution.rangeSumBST(treeNode, 8, 10));
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int value = root.val;
        if (value >= low && value <= high) {
            return value + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        if (value < low) {
            return rangeSumBST(root.right, low, high);
        } else {
            return rangeSumBST(root.left, low, high);
        }
    }

}
