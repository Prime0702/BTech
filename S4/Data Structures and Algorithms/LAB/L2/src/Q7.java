public class Q7 {
    public static SLL add(SLL a, SLL b){
        SLL c = new SLL();
        Node temp1 = a.head;
        Node temp2 = b.head;
        int carry = 0;
        while (temp1 != null && temp2 != null) {
            int sum = temp1.data + temp2.data + carry;
            carry = sum / 10;
            sum = sum % 10;
            c.insertAtEnd(sum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            int sum = temp1.data + carry;
            carry = sum / 10;
            sum = sum % 10;
            c.insertAtEnd(sum);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            int sum = temp2.data + carry;
            carry = sum / 10;
            sum = sum % 10;
            c.insertAtEnd(sum);
            temp2 = temp2.next;
        }
        if (carry != 0) {
            c.insertAtEnd(carry);
        }
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
        System.out.print("Sum List: ");
        SLL ll3 = add(ll1, ll2);
        ll3.traverse();

    }
}
