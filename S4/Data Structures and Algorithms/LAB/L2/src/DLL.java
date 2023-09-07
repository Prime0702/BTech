public class DLL {
    DNode head = null;
    DNode tail = null;
    public void insertAtFront(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAtIthIndex(int data, int index) {
        DNode newNode = new DNode(data);
        if (index == 0) {
            insertAtFront(data);
        } else {
            DNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void deleteAtFront() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void deleteAtIthIndex(int index) {
        if (index == 0) {
            deleteAtFront();
        } else {
            DNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }
    public void deleteByValue(int data) {
        DNode temp = head;
        while (temp != null) {
            if (temp.data == data) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    public void traverse(){
        DNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
