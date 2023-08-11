import java.util.ArrayList;
import java.util.List;



class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { 
            this.val = val; 
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
       }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> toReturn = new ArrayList<>();
        inorderTraversalHelper(root, toReturn);
        return toReturn;
    }
    
    private void inorderTraversalHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
    }
}

