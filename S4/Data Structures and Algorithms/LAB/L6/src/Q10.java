public class Q10 {
    public static void main(String[] args) {
        QueueInt qi1 = new QueueInt();
        QueueInt qi2 = new QueueInt();
        qi1.enqueue(100);
        qi2.enqueue(100);
        qi1.enqueue(200);
        qi2.enqueue(200);
        if (qi1 == qi2) {
            System.out.println("qi1 and qi2 are equal");
        } else {
            System.out.println("qi1 and qi2 are not equal");
        }
    }
}
