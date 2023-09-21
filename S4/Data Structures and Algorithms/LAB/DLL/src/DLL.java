public class DLL {
    Node head = null;
    Node tail = null;
    public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void traverseBackword(){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
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
        Node newNode = new Node(data);
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
        Node newNode = new Node(data);
        if (index == 0) {
            insertAtFront(data);
        } else {
            Node temp = head;
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
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }
    public void deleteByValue(int data) {
        Node temp = head;
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
    
}
