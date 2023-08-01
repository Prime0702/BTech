public class StackInt {
    public IntNode top;

    public StackInt() {
        top = null;
    }

    public void push(int data) {
        IntNode temp = new IntNode(data);
        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void print() {
        if (top != null) {
            IntNode temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void rprint(){
        if (top != null){
            IntNode temp = top;
            StackInt stack = new StackInt();
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }
            stack.print();
        }
    }

    public void PostFixEvaluator(String str) {
        //Input: 1 2 3 * + 4 - Output: 3
        //Input: 2 3 * 15 5 / + 10 - Output: -1
        //Input: 10 2 * 8 4 / + Output: 22

        for (int i = 0; i < str.length(); i++) {
            int number=0;
            if (str.charAt(i) == ' ') {
                continue;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    number = number * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                push(number);
            } else {
                int a = pop();
                int b = pop();
                switch (str.charAt(i)) {
                    case '+':
                        push(a + b);
                        break;
                    case '-':
                        push(b - a);
                        break;
                    case '*':
                        push(a * b);
                        break;
                    case '/':
                        push(b / a);
                        break;
                }
            }
        }
    }

}