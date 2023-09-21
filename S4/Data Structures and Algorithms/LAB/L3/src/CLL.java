public class CLL {
    CNode head;
    CLL(){head = null;}
    void traverse() {
        CNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    void insertAtHead(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head;
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
    }
    void insertAtTail(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
    void insertAfter(int data, int after) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            CNode temp = head;
            while (temp.data != after) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    void deleteValue(int data) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            CNode temp = head;
            while (temp.next.data != data) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    void deletePosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            CNode temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    void search(int data) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            CNode temp = head;
            int pos = 1;
            while (temp.data != data) {
                temp = temp.next;
                pos++;
            }
            System.out.println("Found at position " + pos);
        }
    }
    void sortedInsert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            CNode temp = head;
            while (temp.next.data < data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
