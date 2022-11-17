package ru.itis.lab10;

public class Tree {
    Node root;
    public void add(int a){
        root = addToTree(root,a);
    }
    public void createBinaryTree() {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);

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
