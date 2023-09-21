public class Stack {
    Node top;
    int size;
    int capacity;
    Stack(){
        top=null;
        size=0;
        capacity=-1;
    }
    Stack(int capacity){
        top=null;
        size=0;
        this.capacity=capacity;
    }
    public int length(){
        return size;
    }
    public boolean isEmpty(){
        if (top==null) return true;
        return false;
    }
    public boolean isFull(){
        if (size==capacity) return true;
        return false;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
        else if (isEmpty()){
            Node temp=new Node(data);
            top=temp;
            size++;
        }
        else{
            Node temp=new Node(data);
            temp.next=top;
            top=temp;
            size++;
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int temp=top.data;
            top=top.next;
            size--;
            return temp;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return top.data;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }

}
//65 97 100 105 116 104 121 97 110 32 82 97 106 117
