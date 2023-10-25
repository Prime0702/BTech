public class QueueInt {
    private int[] arr;
    private int front;
    int rear;
    QueueInt(){
        arr= new int[10];
        front=-1;
        rear=-1;
    }
    QueueInt(int size){
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
    public boolean isEmpty(){
        if ((front == -1) && (rear == -1)) return true;
        return false;
    }
    public boolean isFull(){
        return (rear == arr.length-1) ? true : false;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()) {
            front++;
        }
        rear++;
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
            front++;
            return temp;
        }
    }
    public boolean equals(QueueInt q){
        if(this.length()!=q.length()) return false;
        for(int i=0;i<this.length();i++){
            if(this.arr[i]!=q.arr[i]) return false;
        }
        return true;
    }
}
//65 97 100 105 116 104 121 97 110 32 82 97 106 117