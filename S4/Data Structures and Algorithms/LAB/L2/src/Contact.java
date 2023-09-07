public class Contact {
    public String name;
    public String phone;
    public Contact next;
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }
}
