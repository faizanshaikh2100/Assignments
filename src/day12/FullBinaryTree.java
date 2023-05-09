package day12;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class FullBinaryTree
{
    Node root;

    boolean isFullTree(Node node)
    {
        if(node == null)
            return true;

        if(node.left == null && node.right == null )
            return true;

        if((node.left!=null) && (node.right!=null))
            return (isFullTree(node.left) && isFullTree(node.right));

        return false;
    }


    public static void main(String args[])
    {
        FullBinaryTree tree = new FullBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.right.left = new Node(6);


        if(tree.isFullTree(tree.root))
            System.out.print("full");
        else
            System.out.print("T not full");
    }
}