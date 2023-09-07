public class Main {
    public static void main(String[] args) {
        //Q1
        BinTree tree = new BinTree();
        tree.root = new Node("+");
        tree.root.left = new Node("-");
        tree.root.left.left = new Node("+");
        tree.root.left.left.left = new Node("x");
        tree.root.left.left.right = new Node("*");
        tree.root.left.left.right.left = new Node("y");
        tree.root.left.left.right.right = new Node("z");
        tree.root.left.right = new Node("w");
        tree.root.right = new Node("-");
        tree.root.right.left = new Node("u");
        tree.root.right.right = new Node("v");
        tree.inorderTraverse();
        System.out.println();
        //Q2
        //x=3, y=2, z=1, w=6, u=5, v=4
        tree.replace("x", "3");
        tree.replace("y", "2");
        tree.replace("z", "1");
        tree.replace("w", "6");
        tree.replace("u", "5");
        tree.replace("v", "4");
        //Q3
        tree.inorderTraverse();
        System.out.println();
        //Q4
        System.out.println("Level of 1: "+ tree.findLevel("1"));
        //Q5
        System.out.println("Height of 1: "+ tree.findHeight("1"));
        //Q6
        System.out.println("Number of leaves: "+ tree.countLeaves(tree.root));
    }
}