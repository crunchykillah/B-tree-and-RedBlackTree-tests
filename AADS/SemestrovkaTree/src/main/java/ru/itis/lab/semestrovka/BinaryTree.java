package ru.itis.lab.semestrovka;

public class BinaryTree {
    Node root;
    long addCount = 0;
    long containsCount = 0;
    long deleteCount = 0;
    public void add(int a) {
        addCount = 0;
        root = addToTree(root, a);
    }

    //Add element to tree method
    public Node addToTree(Node current, int a) {
        if (current == null) {
            addCount++;
            return new Node(a);
        }
        if (a < current.a) {
            current.left = addToTree(current.left, a);
            addCount++;

        } else if (a > current.a) {
            addCount++;
            current.right = addToTree(current.right, a);
        } else {
            addCount++;
            return current;
        }
        return current;
    }
    // Contains method
    public boolean containsNode(int a) {
        containsCount = 0;
        return containsNodeRecursive(root, a);
    }

    private boolean containsNodeRecursive(Node current, int a) {
        if (current == null) {
            containsCount++;
            return false;
        }

        if (a == current.a) {
            containsCount++;
            return true;
        }
        containsCount++;
        return a < current.a
                ? containsNodeRecursive(current.left, a)
                : containsNodeRecursive(current.right, a);
    }

    // Preorder traversal (root -> left -> right)
    public void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.a + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Inorder traversal (left -> root -> right)
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.a + " ");
            inorderTraversal(root.right);
        }
    }

    // Postorder traversal (left -> right -> root)
    public void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.a + " ");
        }
    }
    public void delete(int a) {
        deleteCount = 0;
        root = deleteRecursive(root, a);
    }

    private Node deleteRecursive(Node current, int a) {
        if (current == null) {
            deleteCount++;
            return null;
        }

        if (a == current.a) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                deleteCount++;
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                deleteCount++;
                return current.left;
            }

            if (current.left == null) {
                deleteCount++;
                return current.right;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.a = smallestValue;
            deleteCount++;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (a < current.a) {
            deleteCount++;
            current.left = deleteRecursive(current.left, a);
            return current;
        }
        deleteCount++;
        current.right = deleteRecursive(current.right, a);
        return current;

    }
    private int findSmallestValue(Node root) {
        deleteCount++;
        return root.left == null ? root.a : findSmallestValue(root.left);
    }
    public long getAddCount(){
        return addCount;
    }
    public long getContainsCount(){
        return containsCount;
    }
    public long getDeleteCount(){
        return deleteCount;
    }
}
