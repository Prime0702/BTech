public class Q3 {
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
        if (ll.isListLooped()){
            System.out.println("List is looped");
        }else {
            System.out.println("List is not looped");
        }
    }
}
