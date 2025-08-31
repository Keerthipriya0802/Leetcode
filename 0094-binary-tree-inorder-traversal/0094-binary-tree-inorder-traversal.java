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
    void iot(TreeNode root,List<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        iot(root.left,res);
        res.add(root.val);
        iot(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res =new ArrayList();
        iot(root,res);
        return res;        
    }
}