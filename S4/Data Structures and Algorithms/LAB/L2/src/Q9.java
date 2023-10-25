public class Q9 {
    private DLL ll;
    private int cd ;
    private DNode current;
    Q9(){
        cd = 1; // 1 for left to right, -1 for right to left
        current = null;
        ll = new DLL();
    }
    public void insertAtEnd(int data) {
        ll.insertAtEnd(data);
    }
    public void startKilling() {
        ll.traverse();
        int n=5;
        current = cd == 1 ? ll.head : ll.tail;
        int count = 0;
        while (!ll.isEmpty()) {
            count++;
            if (count == 4) {
                DNode remove = current;
                current = cd == 1 ? current.next : current.prev;
                ll.deleteByValue(remove.data);
                count = 0;
                ll.traverse();
                n--;
                if (n == 0) {
                    break;
                }
            } else {
                current = cd == 1 ? current.next : current.prev;
            }
            if (current == null) {
                cd = -cd;
                current = cd == 1 ? ll.head : ll.tail;
            }
        }
    }
    public static void main(String[] args) {
        Q9 ll = new Q9();
        ll.insertAtEnd(21);
        ll.insertAtEnd(4);
        ll.insertAtEnd(7);
        ll.insertAtEnd(3);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(12);
        ll.insertAtEnd(18);
        ll.insertAtEnd(3);
        ll.insertAtEnd(27);
        ll.startKilling();
    }
}

