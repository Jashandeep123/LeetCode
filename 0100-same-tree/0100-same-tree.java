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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);  
        // if(inOrder(p).equals(inOrder(q))) return true;
        // return false;
    }

    // public List<Integer> inOrder(TreeNode root){
    //     List<Integer> res=new ArrayList<>();
    //     if(root==null) return res;
    //     inOrderHelper(root, res);
    //     // res.add(root.val);
    //     // inOrder(root.right);
    //     return res;
    // }

    // public void inOrderHelper(TreeNode root, List<Integer> res) {
    //     if (root == null) return;
    //     inOrderHelper(root.left, res);
    //     res.add(root.val);
    //     inOrderHelper(root.right, res);
    // }
}