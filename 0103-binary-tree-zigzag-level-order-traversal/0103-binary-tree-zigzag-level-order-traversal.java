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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
         boolean flag = true;
        while(!q.isEmpty())
        {
            int count=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            while(count!=0)
            {
                TreeNode curr=q.remove();
                l.add(curr.val);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                --count;
            }
            if(flag==false)
            {
                Collections.reverse(l);
            }
            flag=!flag;
            res.add(l);

        }
        return res;
        
    }
}