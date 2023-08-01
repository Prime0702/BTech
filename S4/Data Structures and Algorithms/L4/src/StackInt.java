public class StackInt {
    public int[] stack;
    public int top;
    public int size;

    public StackInt() {
        this.size = 10;
        stack = new int[size];
        top = -1;
    }
    public StackInt(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void print() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]+"\t");
            }
            System.out.println();
        }
    }
    public int getTop() {
        return top;
    }
    public int getSize() {
        return size;
    }
    public boolean equals(StackInt si) {
        if (this.top != si.top) {
            return false;
        } else {
            boolean flag = true;
            StackInt si1 = new StackInt(this.size);
            StackInt si2 = new StackInt(si.size);
            while (!this.isEmpty()) {
                si1.push(this.pop());
            }
            while (!si.isEmpty()) {
                si2.push(si.pop());
            }
            while (!si1.isEmpty()) {
                int value1 = si1.pop();
                int value2 = si2.pop();
                this.push(value1);
                si.push(value2);
                if (value1 != value2) {
                    flag = false;
                }
            }
            return flag;
        }
    }
}
