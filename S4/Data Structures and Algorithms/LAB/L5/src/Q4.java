import java.util.Scanner;

public class Q4 {
    static StackInt A1 = new StackInt();
    static StackInt B2 = new StackInt();
    static StackInt C3 = new StackInt();
    public static void hanoi(int n, StackInt A, StackInt B, StackInt C) {
        if (n == 1) {
            C.push(A.pop());
            print();
        } else {
            hanoi(n - 1, A, C, B);
            C.push(A.pop());
            print();
            hanoi(n - 1, B, A, C);
        }
    }
    public static void print() {
        System.out.print("A | ");A1.rprint();System.out.println();
        System.out.print("B | ");B2.rprint();System.out.println();
        System.out.print("C | ");C3.rprint();System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        //Hanoi Tower
        //  |   |   |
        //  1   |   |
        //  2   |   |
        //  3   |   |
        // -----------
        //  A   B   C
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            A1.push(i);
        }
        System.out.println("Initial State:");
        print();
        hanoi(n, A1, B2, C3);
        System.out.println("Final State:");
        print();

    }  

}
