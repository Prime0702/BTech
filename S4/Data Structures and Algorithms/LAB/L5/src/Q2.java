import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //PostFixEvaluator
        System.out.println("Q2: ");
        StackInt s = new StackInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        s.PostFixEvaluator(str);
        System.out.println("Result: "+s.peek());
        sc.close();
    }
}
