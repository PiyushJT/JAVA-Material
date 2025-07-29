public class BinarySearchTree {

    private static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + "";
        }

    }

    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;

    }


    void delete(int data) {
        root = delete(root, data);
    }

    Node delete(Node root, int data) {

        if (root == null)
            return root;

        if (data < root.data) {
            root.left = delete(root.left, data);
        }
        else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {

            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            root.right = delete(root.right, root.data);

        }
        return root;

    }


    int min() {
        return min(root);
    }

    int min(Node root) {

        if (root == null)
            return 0;

        if (root.left == null)
            return root.data;

        return min(root.left);

    }



    int max() {
        return max(root);
    }

    int max(Node root) {

        if (root == null)
            return 0;

        if (root.right == null)
            return root.data;

        return max(root.right);

    }


    Node predecessor(Node root, int data) {

        Node predecessor = null;

        while (root != null) {

            if (data > root.data) {
                predecessor = root;
                root = root.right;
            }

            else
                root = root.left;

        }
        return predecessor;

    }




    Node successor(Node root, int data) {

        Node successor = null;

        while (root != null) {

            if (data < root.data) {
                successor = root;
                root = root.left;
            }

            else
                root = root.right;
        }

        return successor;

    }


    void inOrder() {
        inOrder(root);
        System.out.println();
    }

    void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    void preOrder() {
        preOrder(root);
        System.out.println();
    }


    void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }


    void postOrder() {
        postOrder(root);
        System.out.println();
    }

    void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }











    void displaySchema() {
        displaySchemaRec(root);
    }


    void displaySchemaRec(Node root) {

        if (root == null)
            return;

        System.out.println("  " + root.data);
        System.out.println(" / \\");


        if (root.left != null)
            System.out.print(root.left + "   ");
        else
            System.out.print("    ");


        if (root.right != null)
            System.out.print(root.right);


        System.out.println();
        System.out.println();

        displaySchemaRec(root.left);
        displaySchemaRec(root.right);

    }





}