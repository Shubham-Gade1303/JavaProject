package July2026;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        // First Tree
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        // Second Tree
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);

        if (isSameTree(t1, t2)) {
            System.out.println("Trees are Same");
        } else {
            System.out.println("Trees are Not Same");
        }
    }
}
