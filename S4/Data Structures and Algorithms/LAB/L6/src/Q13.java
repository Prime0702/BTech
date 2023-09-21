public class Q13 {
    public static void main(String[] args) {
        CircularQueue q1 = new CircularQueue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(3);
        q1.enqueue(40);
        q1.enqueue(50);
        System.out.print("Queue 1:");
        q1.print();
        System.out.println("Min: " + q1.getMinElement());

    }
}
