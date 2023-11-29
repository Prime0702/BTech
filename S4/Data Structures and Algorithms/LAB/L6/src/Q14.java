public class Q14 {
    public static void main(String[] args) {
        Deque q1 = new Deque();
        q1.insertFront(10);
        q1.insertLast(20);
        q1.insertFront(30);
        q1.deleteFront();
        q1.deleteLast();
        q1.insertLast(25);
        q1.insertFront(40);
        q1.insertFront(50);
        System.out.println("getRear(): "+ q1.getRear());
        System.out.println("getFront(): "+ q1.getFront());
    }
}
