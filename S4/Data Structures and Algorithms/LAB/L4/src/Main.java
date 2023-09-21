public class Main {
    public static void main(String[] args) {
        System.out.println("Q1. Creating a stack of size 5 and top = -1");
        StackInt stack = new StackInt(5);
        System.out.println("Q2. No Error");
        System.out.println("Q3. Current top: " + stack.top);
        System.out.println("Q4. Creating Stack using Default constructor.");
        StackInt si = new StackInt();
        System.out.println("    Length of stack: " + si.stack.length);
        System.out.println("    No Error");
        System.out.println("Q5. Creating Stack using Parameterized constructor.");
        StackInt si2 = new StackInt(15);
        System.out.println("    Length of stack: " + si2.stack.length);
        System.out.println("    No Error");
        System.out.println("Q4. print() method");
        System.out.println("Q5. push() method");
        System.out.println("    Pushing 100 into stack si");
        si.push(100);
        System.out.println("    Pushing 200 into stack si");
        si.push(200);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 300 into stack si");
        si.push(300);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 400 into stack si");
        si.push(400);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 500 into stack si");
        si.push(500);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 600 into stack si");
        si.push(600);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 700 into stack si");
        si.push(700);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 800 into stack si");
        si.push(800);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 900 into stack si");
        si.push(900);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Pushing 1000 into stack si");
        si.push(1000);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.print("    Pushing 1100 into stack si\n    ");
        si.push(1100);
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    No Error as ArrayIndexOutOfBoundsException is controlled");
        System.out.println("Q7. top: " + si.top);
        System.out.println("    length: " + si.stack.length);
        System.out.println("Q9. pop() method");
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.println("    Popping from stack si");
        System.out.println("    Popped: " + si.pop());
        System.out.print("    Printing stack si\n    ");
        si.print();
        System.out.print("    Popping from stack si\n    ");
        si.pop();
        System.out.print("Q10. peek() method\n     ");
        System.out.println("     Peek: " + stack.peek());
        System.out.println("     Pushing 100 into stack");
        stack.push(100);
        System.out.println("     Pushing 200 into stack");
        stack.push(200);
        System.out.println("     Pushing 300 into stack");
        stack.push(300);
        System.out.println("     Peek: " + stack.peek());
        StackInt si1=new StackInt(5);
        si1.push(100);
        si1.push(200);
        si1.push(300);
        si2=new StackInt(5);
        si2.push(100);
        si2.push(200);
        si2.push(300);
        System.out.println("Q11. checking s1 and s2 are equal using ==");
        System.out.println("     stack si1 and s2 contains same elements 100,200,300");
        System.out.println("     si1==si2");
        if(si1==si2)
        {
            System.out.println("     Equal");
        }
        else
        {
            System.out.println("     Not Equal");
        }
        System.out.println("     Reason they are 2 different objects");
        System.out.println("Q12. checking s1 and s2 are equal using equals()");
        System.out.println("     stack si1 and s2 contains same elements 100,200,300");
        System.out.println("     si1.equals(si2)");
        if(si1.equals(si2))
        {
            System.out.println("     Equal");
        }
        else
        {
            System.out.println("     Not Equal");
        }


    }
}