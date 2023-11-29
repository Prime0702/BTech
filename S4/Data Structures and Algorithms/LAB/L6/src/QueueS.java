public class QueueS {
    private Stack s1;
    private Stack s2;
    QueueS(){
        s1=new Stack();
        s2=new Stack();
    }
    public void enqueue(int data){
        s1.push(data);
    }
    public int dequeue(){
        if (s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int d=s1.pop();
            while (!s1.isEmpty()){
                s2.push(d);
                d=s1.pop();
            }
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return d;
        }
    }
    public void print(){
        s1.print();
    }
    public int peek(){
        if (s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int d=-1;
            while (!s1.isEmpty()){
                d=s1.pop();
                s2.push(d);
            }
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return d;
        }
    }

}
//65 97 100 105 116 104 121 97 110 32 82 97 106 117