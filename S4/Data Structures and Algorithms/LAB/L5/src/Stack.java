public class Stack {
    private Node top;
    Stack(){
        top = null;
    }
    public void push(char value) {
        Node newNode = new Node(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }
    public char pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return ' ';
        } else {
            char value = top.data;
            top = top.next;
            return value;
        }
    }
    public char peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return ' ';
        } else {
            return top.data;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void print() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }
    public void balencedParenthesis(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
                push(str.charAt(i));
            } else {
                if (str.charAt(i)==')') {
                    if (peek()=='(') {
                        pop();
                    } else {
                        System.out.println("Wrong!");
                        return;
                    }
                } else if (str.charAt(i)==']') {
                    if (peek()=='[') {
                        pop();
                    } else {
                        System.out.println("Wrong!");
                        return;
                    }
                } else if (str.charAt(i)=='}') {
                    if (peek()=='{') {
                        pop();
                    } else {
                        System.out.println("Wrong!");
                        return;
                    }
                }
            }
        }
        if (isEmpty()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

    }


}
