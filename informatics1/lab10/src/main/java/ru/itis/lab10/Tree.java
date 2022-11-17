package ru.itis.lab10;

public class Tree {
    Node root;
    public void add(int a){
        root = addToTree(root,a);
    }
    public Tree createBinaryTree() {
        Tree bt = new Tree();

        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);

        return bt;
    }
    public Node addToTree(Node current, int a){
        if (current == null){
            return new Node(a);
        }
        if (a < current.a){
            current.left = addToTree(current.left,a);

        } else if (a > current.a){
            current.right = addToTree(current.right,a);
        } else {
            return current;
        }
        return current;
    }

    public void printNode(Node node){
        if (node != null){
            System.out.println(node.a);
            printNode(node.left);
            printNode(node.right);

        }
    }
    public void printTree(){
        printNode(root);
    }

}
