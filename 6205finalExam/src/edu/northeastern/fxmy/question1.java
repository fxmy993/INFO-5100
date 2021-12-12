package edu.northeastern.fxmy;

public class question1 {

    public static void main(String[] args) {
        int[] level = {1,2,3,4,5,6,7};
        int[] in = {4,2,5,1,6,3,7};
        Tree tree = new Tree();
        tree.buildTree(in,level);
    }
}
