package edu.northeastern.fxmy;

public class question2 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(7);
        tree.root.left.right = new TreeNode(9);
        tree.root.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(11);


        System.out.println(tree.isFoldable(tree.root));
    }
}
