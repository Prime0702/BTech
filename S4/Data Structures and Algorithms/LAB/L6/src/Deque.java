public class Deque {
    Node front;
    Node rear;
    int capacity;
    int size;
    Deque(){
        front=null;
        rear=null;
        capacity=-1;
        size=0;
    }
    Deque(int capacity){
        front=null;
        rear=null;
        this.capacity=capacity;
        size=0;
    }
    public int length(){
        return size;
    }
    public boolean isEmpty(){
        if (front==null && rear==null) return true;
        return false;
    }
    public boolean isFull(){
        if (size==capacity) return true;
        return false;
    }
    public void insertFront(int data){
        if (isFull()){
            System.out.println("Deque is full");
            return;
        }
        else if (isEmpty()){
            Node temp=new Node(data);
            front=temp;
            rear=temp;
            size++;
        }
        else{
            Node temp=new Node(data);
            temp.next=front;
            front.prev=temp;
            front=temp;
            size++;
        }
    }
    public void insertLast(int data){
        if (isFull()){
            System.out.println("Deque is full");
            return;
        }
        else if (isEmpty()){
            Node temp=new Node(data);
            front=temp;
            rear=temp;
            size++;
        }
        else{
            Node temp=new Node(data);
            rear.next=temp;
            temp.prev=rear;
            rear=temp;
            size++;
        }
    }
    public int deleteFront(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        else if (front==rear){
            int temp=front.data;
            front=null;
            rear=null;
            size--;
            return temp;
        }
        else{
            int temp=front.data;
            front=front.next;
            front.prev=null;
            size--;
            return temp;
        }
    }
    public int deleteLast(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        else if (front==rear){
            int temp=rear.data;
            front=null;
            rear=null;
            size--;
            return temp;
        }
        else{
            int temp=rear.data;
            rear=rear.prev;
            rear.next=null;
            size--;
            return temp;
        }
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }
    public int getFront(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        return front.data;
    }
    public int getRear(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        return rear.data;
    }
}
//65 97 100 105 116 104 121 97 110 32 82 97 106 117
