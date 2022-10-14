package io.javabrains;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {

    public  boolean isSame(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) {
            return true;
        } else if (t1==null && t2!=null) {
            return false;
        } else if (t2==null && t1!=null) {
            return false;
        } else {
            if(t1.val != t2.val) {
                return false;
            } else {
                return isSame(t1.left, t2.left) && isSame(t1.right,t2.right);
            }
        }
    }

}
