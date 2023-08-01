public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] arr = {30, 35, 40, 50, 12, 17, 45, 90,23,56};
        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }
        bst.inorderTraverse();
        System.out.println("Deleting 17");
        bst.delete(17);
        bst.postorderTraverse();
        bst.preorderTraverse();
        arr= new int[]{40,90,32,92,56};
        for (int i = 0; i < arr.length; i++) {
            Node n = bst.search(arr[i]);
            if (n != null) {
                System.out.println("Found " + arr[i]);
            }
            else {
                System.out.println("Not Found " + arr[i]);
            }
        }
        System.out.println("Minimum value: " + bst.findMin().data);
        System.out.println("Maximum value: " + bst.findMax().data);
        System.out.println("Height of the tree: " + bst.findHeight());
        System.out.println("5th Largest value: " + bst.getKthLargestElement(5).data);

        Node binaryTree = new Node(15);
        binaryTree.left = new Node(30);
        binaryTree.right = new Node(12);
        binaryTree.left.left = new Node(1);
        binaryTree.left.left.left = new Node(2);
        binaryTree.right.right = new Node(11);
        binaryTree.right.left = new Node(13);

        System.out.println("Q16");
        BST bst2 = new BST(binaryTree);
        bst2.inorderTraverse();
        bst2.preorderTraverse();

    }
}