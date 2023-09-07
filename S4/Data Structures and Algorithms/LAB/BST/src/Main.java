public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] arr = {53,29,13,11,15,35,39,67,57,54,59,70,72};
        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }
        bst.inorderTraverse();
        System.out.println();
    }
}