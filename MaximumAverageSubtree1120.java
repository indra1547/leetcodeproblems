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
    double maxAvg = 0.0;
    public double maximumAverageSubtree(TreeNode root) {
        process(root);
        return maxAvg;
    }
    public int[] process(TreeNode root){
        int[] data = new int[2];
        if(root == null){
            return data;
        }
        int[] leftData = process(root.left);
        int[] rightData = process(root.right);
        // capture sum of nodes
        data[0] = root.val + leftData[0] + rightData[0];
        // capture node count
        data[1] = 1+ leftData[1] + rightData[1];
        double avg = (double)data[0]/data[1];
        maxAvg = Math.max(maxAvg, avg);
        return data;
    }
}
