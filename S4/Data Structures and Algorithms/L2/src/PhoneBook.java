public class PhoneBook {
    public Contact head;
    public PhoneBook() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void insert(String name, String phone) {
        Contact newNode = new Contact(name, phone);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        if (head.name.compareTo(newNode.name) >= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Contact temp = head;
        while (temp.next != null && temp.next.name.compareTo(newNode.name) < 0) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void list() {
        if (isEmpty()) {
            System.out.println("PhoneBook is empty");
            return;
        }
        Contact temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.phone);
            temp = temp.next;
        }
    }
    public void deleteByValue(String name) {
        if (isEmpty()) {
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Contact temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }
}
