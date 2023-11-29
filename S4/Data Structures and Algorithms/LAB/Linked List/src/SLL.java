public class SLL {
    Node head;
    public boolean isLastData(int data) {
        Node Temp = head;
        while (Temp.next != null) {
            Temp = Temp.next;
        }
        if (Temp.data == data) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isLastElement(Node node) {
        if (node.next == null) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }else {
            return false;
        }
    }
    public void traverse(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void insertAfterIthPosition(int data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteAtFront() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd() {
        if (isEmpty()) {
            return;
        }
        if (isLastElement(head)) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAtIthIndex(int index) {
        if (isEmpty()) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || isLastElement(temp)) {
            return;
        }
        temp.next = temp.next.next;
    }
    public void sortedInsert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        if (head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < newNode.data) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteByValue(int data) {
        if (isEmpty()) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (isLastElement(temp)) {
            return;
        }
        temp.next = temp.next.next;
    }
    public void evenPosition() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count % 2 != 0) {
                System.out.print(temp.data + " ");
            }
            count++;
            temp = temp.next;
        }
        System.out.println();
    }
    public void isPalindrome() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        for (int i = 0; i < count; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }
        int i = 0;
        int j = count - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }

}
