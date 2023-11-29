public class Q6 {
    public static SLL merge(SLL a, SLL b){
        SLL c = new SLL();
        Node temp1 = a.head;
        Node temp2 = b.head;
        while (temp1 != null && temp2 != null) {
                c.insertAtEnd(temp1.data);
                temp1 = temp1.next;
                c.insertAtEnd(temp2.data);
                temp2 = temp2.next;
        }
        while (temp1 != null) {
            c.insertAtEnd(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            c.insertAtEnd(temp2.data);
            temp2 = temp2.next;
        }
        c.traverse();
        return c;
    }
    public static void main(String[] args) {
        SLL ll1 = new SLL();
        SLL ll2 = new SLL();
        ll1.insertAtEnd(2);
        ll1.insertAtEnd(3);
        ll1.insertAtEnd(4);
        ll1.insertAtEnd(5);
        ll2.insertAtEnd(3);
        ll2.insertAtEnd(1);
        ll2.insertAtEnd(9);
        ll2.insertAtEnd(7);
        System.out.print("Original List1: ");
        ll1.traverse();
        System.out.print("Original List2: ");
        ll2.traverse();
        System.out.print("Merged List: ");
        SLL ll3 = merge(ll1, ll2);
        ll3.traverse();
    }
}
