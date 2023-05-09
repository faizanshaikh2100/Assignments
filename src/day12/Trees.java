package day12;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class Trees {
    Node root;

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public void inOrder(Node root) {
        inOrder(root.left);
        System.out.println(root.val + "->");
        inOrder(root.right);
    }

    public void preOrder(Node root) {

        System.out.println(root.val + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val + "->");
    }

    public boolean isBalanced(Node root) {
        if(root==null)return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left -right >1)return false;
        return true;
    }

    private int getHeight(Node root) {
        if(root==null)return 0;
        int left  = getHeight(root.left);
        int right  = getHeight(root.right);

        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Trees tree = new Trees();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println(tree.getHeight(tree.root));
        System.out.println(tree.isBalanced(tree.root));
//        System.out.println("\nInOrder :: ");
//        tree.inOrder(tree.root);
//
//        System.out.println("\nPostOrder :: ");
//        tree.postOrder(tree.root);
//
//        System.out.println("\nPreOrder :: ");
//        tree.preOrder(tree.root);


    }
}
