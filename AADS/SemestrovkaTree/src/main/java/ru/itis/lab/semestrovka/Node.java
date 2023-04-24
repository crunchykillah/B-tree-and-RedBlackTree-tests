package ru.itis.lab.semestrovka;

public class Node {
    public int a;
    public Node left;
    public Node right;


    Node(int a) {
        this.a = a;
        right = null;
        left = null;
    }
}