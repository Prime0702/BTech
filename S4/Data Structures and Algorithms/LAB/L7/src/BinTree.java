public class BinTree {
    Node root;
    BinTree() {this.root = null;}
    public void inorderTraverse(){inorderTraverse(this.root);}
    void inorderTraverse(Node n){
        if (n != null) {
            if (n.left != null && n.right != null) System.out.print("(");
            inorderTraverse(n.left);
            System.out.print(n.data);
            inorderTraverse(n.right);
            if (n.left != null && n.right != null) System.out.print(")");
        }
    }
    public int findLevel(String data){return findLevel(this.root, data, 0);}
    int findLevel(Node n, String data, int level){
        if (n == null) return -1;
        if (n.data.equals(data)) return level;
        int downlevel = findLevel(n.left, data, level + 1);
        if (downlevel != -1) return downlevel;
        downlevel = findLevel(n.right, data, level + 1);
        return downlevel;
    }
    public int findHeight(String data){
        Node n = findNode(data);
        return findHeight(n);
    }
    public int findHeight(Node n){
        if (n == null) return -1;
        int left = findHeight(n.left);
        int right = findHeight(n.right);
        if (left > right) return left + 1;
        else return right + 1;
    }
    public Node findNode(String data){return findNode(this.root, data);}
    public Node findNode(Node n,String data){
        if (n == null) return null;
        if (n.data.equals(data)) return n;
        Node left = findNode(n.left, data);
        if (left != null) return left;
        Node right = findNode(n.right, data);
        return right;
    }
    public void replace(String data, String newData){
        Node n = findNode(data);
        while (n!=null){
            n.data=newData;
            n=findNode(data);
        }
    }
    public int countLeaves(Node n){
        if (n == null) return 0;
        if (n.left == null && n.right == null) return 1;
        else return countLeaves(n.left) + countLeaves(n.right);
    }
}
