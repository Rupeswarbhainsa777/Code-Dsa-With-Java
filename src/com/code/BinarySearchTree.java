package com.code;



public class BinarySearchTree {


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);
        tree.insert(2);
        tree.preOrder();

    }
}
