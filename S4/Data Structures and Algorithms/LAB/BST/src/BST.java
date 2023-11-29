public class BST {
    Node root;
    BST() {
        this.root = null;
    }
    public void inorderTraverse(){
        inorderTraverse(this.root);
    }
    void inorderTraverse(Node n){
        if (n != null) {
            inorderTraverse(n.left);
            System.out.print(n.data + " ");
            inorderTraverse(n.right);
        }
    }

    public void insert(int data){
        this.root = insert(this.root, data);
    }
    Node insert(Node n, int data){
        if (n == null) {
            n = new Node(data);
        }
        else {
            if (data <= n.data) {
                n.left = insert(n.left, data);
            }
            else {
                n.right = insert(n.right, data);
            }
        }
        return n;
    }
}
