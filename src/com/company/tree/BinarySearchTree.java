package com.company.tree;


public class BinarySearchTree {
    private Node root;

    public void add(int value){
        if (this.root == null){
            this.root = new Node(value);
        } else {
            this.root.add(value);
        }
    }

    @Override
    public String toString(){
        String result = "[";
        result += recursive(this.root, "");
        return result + "]";
    }

    private String recursive(Node cursor, String result) {
        if (cursor == null) return "";
        recursive(cursor.getLeft(), Integer.toString(cursor.getValue()));
        result += cursor.getValue();
        recursive(cursor.getRight(), Integer.toString(cursor.getValue()));
        return result;
    }
}
