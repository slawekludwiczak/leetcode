package range_sum_of_bst;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/range-sum-of-bst/description/
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        System.out.println(solution.rangeSumBST(treeNode, 8, 10));
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> treeStack = new ArrayDeque<>();
        treeStack.push(root);
        int sum = 0;
        while (!treeStack.isEmpty()) {
            TreeNode nextNode = treeStack.pop();
            int val = nextNode.val;
            if (val >= low && val <= high) {
                sum += val;
            }
            if (nextNode.left != null) {
                treeStack.push(nextNode.left);
            }
            if (nextNode.right != null) {
                treeStack.push(nextNode.right);
            }
        }
        return sum;
    }
}
