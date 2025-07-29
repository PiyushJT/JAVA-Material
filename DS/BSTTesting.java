public class BSTTesting {


    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
        bst.insert(9);
        bst.insert(6);
        bst.insert(5);

        bst.delete(9);

        bst.displaySchema();

        System.out.println("Min is " + bst.min());

        System.out.println("Max is " + bst.max());

        System.out.println("Pred of 5 is " + bst.predecessor(bst.root, 5));

        System.out.println("Suc of 5 is " + bst.successor(bst.root, 5));

        System.out.println("Inorder: ");
        bst.inOrder();

        System.out.println("Preorder: ");
        bst.preOrder();

        System.out.println("Postorder: ");
        bst.postOrder();

    }

}