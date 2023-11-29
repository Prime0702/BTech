import java.util.Scanner;

public class Q3 {
    Stack st;
    public Q3() {
        st = new Stack();
    }
    public int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public String InfixToPostfix(String str){
        String result = "";
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }
                if (!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    st.pop();
                }
            }else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    result += st.pop();
                }
                st.push(ch);
            }else if (ch == ' ') {
                continue;
            }else {
                result += ch;
            }
        }
        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        //Infix to postfix conversion
        Q3 st = new Q3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String str = sc.nextLine();
        System.out.println("Postfix expression: "+st.InfixToPostfix(str));
        sc.close();
    }
}