import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        //Parenthesis Evaluation
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1: ");
        Stack st = new Stack();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        st.balencedParenthesis(str);
        sc.close();
    }
}