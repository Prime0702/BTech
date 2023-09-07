public class Q8 {
    public static void main(String[] args) {
        QueueInt qi = new QueueInt();
        qi.enqueue(100);
        qi.print();
        qi.enqueue(200);
        qi.print();
        qi.enqueue(300);
        qi.print();
        qi.dequeue();
        qi.print();
        qi.dequeue();
        qi.print();
        qi.dequeue();
        qi.print();
        qi.dequeue();
    }
}

