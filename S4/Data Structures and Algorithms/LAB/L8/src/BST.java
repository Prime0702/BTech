import java.util.Arrays;
import java.util.Stack;
public class BST {
    Node root;
    BST(){
        this.root = null;
    }
    BST(Node root){
        this.root = root;
        convertToBST(this.root);
    }
    public void insert(int data){
        this.root = insert(this.root, data);
    }
    Node insert(Node n, int data){
        if (n == null) n = new Node(data);
        else {
            if (data <= n.data) n.left = insert(n.left, data);
            else n.right = insert(n.right, data);
        }
        return n;
    }
    public void inorderTraverse(){
        System.out.print("Inorder Traversal: ");
        inorderTraverse(this.root);
        System.out.println();
    }
    void inorderTraverse(Node n){
        if (n != null) {
            inorderTraverse(n.left);
            System.out.print(n.data + " ");
            inorderTraverse(n.right);
        }
    }
    public void preorderTraverse(){
        System.out.print("Preorder Traversal: ");
        preorderTraverse(this.root);
        System.out.println();
    }
    void preorderTraverse(Node n){
        if (n != null) {
            System.out.print(n.data + " ");
            preorderTraverse(n.left);
            preorderTraverse(n.right);
        }
    }
    public void postorderTraverse(){
        System.out.print("Postorder Traversal: ");
        postorderTraverse(this.root);
        System.out.println();
    }
    void postorderTraverse(Node n){
        if (n != null) {
            postorderTraverse(n.left);
            postorderTraverse(n.right);
            System.out.print(n.data + " ");
        }
    }
    void delete(int data){
        this.root = delete(this.root, data);
    }
    Node delete(Node n, int data){
        if (n == null) return null;
        if (data < n.data) n.left = delete(n.left, data);
        else if (data > n.data) n.right = delete(n.right, data);
        else {
            if (n.left == null && n.right == null) n = null;
            else if (n.left == null) n = n.right;
            else if (n.right == null) n = n.left;
            else {
                Node temp = findMin(n.right);
                n.data = temp.data;
                n.right = delete(n.right, temp.data);
            }
        }
        return n;
    }
    Node findMin(){
        return findMin(this.root);
    }
    Node findMin(Node n){
        while (n.left != null) n = n.left;
        return n;
    }
    Node search(int data){
        return search(this.root, data);
    }
    Node search(Node n, int data){
        if (n == null || n.data == data) return n;
        else if (data < n.data) return search(n.left, data);
        else return search(n.right, data);
    }
    Node findMax(){
        return findMax(this.root);
    }
    Node findMax(Node n){
        while (n.right != null) n = n.right;
        return n;
    }
    public int findHeight(){
        return findHeight(this.root);
    }
    public int findHeight(Node n){
        if (n == null) return -1;
        int left = findHeight(n.left);
        int right = findHeight(n.right);
        if (left > right) return left + 1;
        else return right + 1;
    }
    public Node getKthLargestElement(int k){
        Node max = findMax();
        while( --k != 0) max = inorderPredecessor(max);
        return max;
    }
    Node findParent(Node n){
        Node parent = null;
        Node temp = this.root;
        while (temp != null) {
            if (temp.data == n.data) break;
            else if (n.data < temp.data) {
                parent = temp;
                temp = temp.left;
            }
            else {
                parent = temp;
                temp = temp.right;
            }
        }
        return parent;
    }
    Node inorderPredecessor(Node n){
        if (n.left != null) return findMax(n.left);
        else {
            Node parent = findParent(n);
            while (parent != null && n == parent.left) {
                n = parent;
                parent = findParent(parent);
            }
            return parent;
        }
    }
    public int countNodes(Node root){
        return root == null ? 0 : countNodes(root.left) + countNodes(root.right) + 1;
    }
    public int[] sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    int[] inorderUsingLoop(Node n){
        int[] arr = new int[countNodes(n)];
        Stack<Node> stack = new Stack<Node>();
        Node temp = n;
        int i = 0;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            arr[i++] = temp.data;
            temp = temp.right;
        }
        return arr;
    }
    public void convertToBST(Node root){
        int[] arr = inorderUsingLoop(root);
        arr = sort(arr);
        convertToBST(root, arr);
    }
    public void convertToBST(Node root, int[] arr){
        root.data = arr[countNodes(root.left)];
        if (root.left != null) convertToBST(root.left, Arrays.copyOfRange(arr, 0, countNodes(root.left)));
        if (root.right != null) convertToBST(root.right, Arrays.copyOfRange(arr, countNodes(root.left) + 1, arr.length));
    }
}
