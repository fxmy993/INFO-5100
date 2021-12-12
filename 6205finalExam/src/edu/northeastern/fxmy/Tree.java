package edu.northeastern.fxmy;

public class Tree {

    public TreeNode root;
    public Tree(){
        this.root = null;
    }

    public TreeNode buildTree(int in[], int level[])
    {
        root = null;
        return constructTree(root, level, in, 0,
                in.length - 1);
    }

    public TreeNode constructTree(TreeNode root, int[] levelOrder, int[] inOrder, int inStart, int inEnd)
    {

        if (inStart == inEnd)
            return new TreeNode(inOrder[inStart]);

        boolean found = false;
        int index = 0;

        for (int i = 0; i < levelOrder.length - 1; i++) {
            int data = levelOrder[i];
            for (int j = inStart; j < inEnd; j++) {
                if (data == inOrder[j]) {
                    root = new TreeNode(data);
                    index = j;
                    found = true;
                    break;
                }
            }
            if (found == true)
                break;
        }

        root.left = constructTree(root,levelOrder,inOrder,inStart,index-1);
        root.right = constructTree(root, levelOrder, inOrder,index + 1, inEnd);

        return root;
    }

    public boolean isFoldable(TreeNode node){
        if(node == null){
            return true;
        }

        mir(node.right);
        boolean result = same(node.left, node.right);
        mir(node.right);

        return  result;
    }

    private void mir(TreeNode node){
        if(node == null){
            return;
        }
        mir(node.left);
        mir(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public boolean same(TreeNode node1, TreeNode node2){
        if(node1 == null&&node2 == null){
            return true;
        }
        if(node1 == null||node2 == null){
            return false;
        }

        return same(node1.left, node2.left)&&same(node1.right, node2.right) ;
    }
}
