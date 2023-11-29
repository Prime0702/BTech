public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    CircularQueue(){
        arr= new int[10];
        front=-1;
        rear=-1;
    }
    CircularQueue(int size){
        arr= new int[size];
        front=-1;
        rear=-1;
    }
    public int length(){
        return arr.length;
    }
    public int getFront(){
        return arr[front];
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public boolean isFull(){
        return ((rear+1) % length() == front) ? true : false;
    }
    public boolean isEmpty(){
        if ((front == -1) && (rear == -1)) return true;
        return false;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()) {
            front++;
        }
        rear=(rear+1)%length();
        arr[rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front==rear){
            int temp=arr[front];
            front=-1;
            rear=-1;
            return temp;
        }
        else{
            int temp=arr[front];
            front=(front+1)%length();
            return temp;
        }
    }
    public void splitq(CircularQueue q2){
        CircularQueue q3=new CircularQueue(length());
        for (int i=0;i<length();i++){
            if ((i+1)%2==0) q2.enqueue(arr[i]);
            else q3.enqueue(arr[i]);
        }
        this.arr = q3.arr;
    }
    public int getMinElement(){
        CircularQueue q2=new CircularQueue(length());
        int min=arr[front];
        while (!isEmpty()){
            int temp=dequeue();
            if (temp<min) min=temp;
            q2.enqueue(temp);
        }
        this.arr=q2.arr;
        return min;
    }
}

//65 97 100 105 116 104 121 97 110 32 82 97 106 117