package day14;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LcaBst {
    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
        }

        if (root.val > p && root.val > q) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p && root.val < q) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(10);


        int p = 2;
        int q = 3;
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p + " & " + q + " is: " + lca.val);
    }
}