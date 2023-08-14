class NaturalNumberPrinter implements Runnable
{
    int start,end;
    public NaturalNumberPrinter(int start, int end){
        this.start=start;
        this.end=end;
    }
    public void run() {
        for(int i=start;i<=end;i=i+2)
        {
            System.out.print(i+" ");
        }}}
public class q9
{
    public static void main(String[] args){
        int N = 10;
        Thread t1 = new Thread(new NaturalNumberPrinter(0, 100));
        Thread t2 = new Thread(new NaturalNumberPrinter(1, 99));
        t1.start();
        t2.start();}}