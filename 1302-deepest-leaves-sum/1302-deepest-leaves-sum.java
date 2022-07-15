/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private ArrayList<Integer> arr = new ArrayList<Integer>();

    public int deepestLeavesSum(TreeNode root) {
        sum(root, 0);
        return arr.get(arr.size() - 1);
    }

    private void sum(TreeNode root, int level) {
        if (level >= arr.size()) {
            arr.add(root.val);
        } else {
            arr.set(level, arr.get(level) + root.val);
        }

        if (root.left != null)
            sum(root.left, level + 1);
        if (root.right != null)
            sum(root.right, level + 1);
    }

}