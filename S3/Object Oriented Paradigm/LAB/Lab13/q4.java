public class q4 extends Thread{
    public void run()
    {
        System.out.println("CS ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("engineering ");
    }
    public static void main(String[] args)
    {
        q4 c1 = new q4();
        q4 c2 = new q4();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}
