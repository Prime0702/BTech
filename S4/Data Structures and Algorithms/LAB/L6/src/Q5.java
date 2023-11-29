public class Q5 {
    public static void main(String[] args) {
        QueueInt qi = new QueueInt();
        qi.enqueue(100);
        qi.print();
        qi.enqueue(200);
        qi.print();
        qi.enqueue(300);
        qi.print();
        qi.enqueue(400);
        qi.print();
        qi.enqueue(500);
        qi.print();
        qi.enqueue(600);
        qi.print();
        qi.enqueue(700);
        qi.print();
        qi.enqueue(800);
        qi.print();
        qi.enqueue(900);
        qi.print();
        qi.enqueue(1000);
        qi.print();
        System.out.println("Front: "+qi.getFront());
    }
}
