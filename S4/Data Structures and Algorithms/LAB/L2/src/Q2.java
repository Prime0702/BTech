import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(3);
        ll.insertAtEnd(1);
        ll.insertAtEnd(9);
        ll.insertAtEnd(7);
        System.out.print("Original List: ");
        ll.traverse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        System.out.print("Kth Element from the end: ");
        ll.kthElementFromEnd(k);
        sc.close();
    }
}
