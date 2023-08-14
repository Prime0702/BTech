class PrintCount {
    private boolean isExecuted = false;
    public synchronized void count() {
        if(!isExecuted){
            for (int i = 1; i <= 1; i++){
                System.out.println("Counting: " + i);
            }
            isExecuted = true;}}}
class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintCount P;
    ThreadDemo(String name, PrintCount P) {
        threadName = name;
        this.P = P;}
    public void run() {
        P.count();}
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();}}}
public class q12{
    public static void main(String[] args) throws InterruptedException{
        PrintCount P = new PrintCount();
        ThreadDemo T1 = new ThreadDemo("Thread 1", P);
        ThreadDemo T2 = new ThreadDemo("Thread 2", P);
        T1.start();
        T1.join();
        T2.start();
    }
}