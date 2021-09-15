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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int range_sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            if(currentNode!=null && currentNode.val>=low && currentNode.val<=high){
                range_sum += currentNode.val;
            }
            if(currentNode.left!=null && currentNode.val > low){
                stack.push(currentNode.left);
            }
            if(currentNode.right!=null && currentNode.val < high){
                stack.push(currentNode.right);
            }
        }
        return range_sum;
    }
}

/*

GO to Left subtree -> When node value is greather than L
GO to right subtree -> When node value is less than or equal to R

*/
