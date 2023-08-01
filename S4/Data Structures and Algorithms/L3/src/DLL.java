public class DLL {
    Node head;
    Node tail;
    DLL(){head = null; tail = null;}
    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (position == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                Node temp = head;
                for (int i = 0; i < position - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                if (newNode.next != null) {
                    newNode.next.prev = newNode;
                } else {
                    tail = newNode;
                }
            }
        }
    }
    void deleteValue(int data) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.data != data) {
                temp = temp.next;
            }
            if (temp == head) {
                head = head.next;
                head.prev = null;
            } else if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }
    void sort() {
        Node temp = head;
        while (temp != null) {
            Node temp2 = temp.next;
            while (temp2 != null) {
                if (temp.data > temp2.data) {
                    int tempData = temp.data;
                    temp.data = temp2.data;
                    temp2.data = tempData;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }
    public Node reverseFirstKNodes( int k) {
        Node temp = head;
        Node temp2 = head;
        for (int i = 0; i < k; i++) {
            temp2 = temp2.next;
        }
        Node prev = null;
        while (temp != temp2) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head.next = temp2;
        temp2.prev = head;
        head = prev;
        return head;
    }

    DLL mergeSort(DLL list2){
        Node temp = head;
        Node temp2 = list2.head;
        DLL list3 = new DLL();
        while (temp != null && temp2 != null) {
            if (temp.data < temp2.data) {
                list3.insertAtPosition(temp.data, list3.length());
                temp = temp.next;
            } else {
                list3.insertAtPosition(temp2.data, list3.length());
                temp2 = temp2.next;
            }
        }
        while (temp != null) {
            list3.insertAtPosition(temp.data, list3.length());
            temp = temp.next;
        }
        while (temp2 != null) {
            list3.insertAtPosition(temp2.data, list3.length());
            temp2 = temp2.next;
        }
        return list3;
    }

    int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    void clear() {
        head = null;
        tail = null;
    }

    void sumOfPair(int sum){
        Node temp = head;
        Node temp2 = tail;
        while (temp != temp2) {
            if (temp.data + temp2.data == sum) {
                System.out.print("(" + temp.data + "," + temp2.data + ") ");
                temp = temp.next;
                temp2 = temp2.prev;
            } else if (temp.data + temp2.data < sum) {
                temp = temp.next;
            } else {
                temp2 = temp2.prev;
            }
        }
        System.out.println();
    }
}
