#include <iostream>
#include<array>

using namespace std;
array<string,10>ar_queue;
array<string,10>::iterator itr;

int front=-1;
int rear=-1;

void push(const array<string,10>&y,string x)
{
    if(rear==((ar_queue.size())-1))
    {
        cout<<"Overflow";
    }
    else{
        if(front==-1 && rear==-1)
        {
            front=0;
        }
        rear++;
        ar_queue[rear]=x;
    }
}

void pop(const array<string,10>&y)
{
    if(front==-1)
    {
        cout<<"Underflow";
    }
    else{
        {
            ar_queue[front]="null";
            if(front==rear)
            {
                rear=-1;
                front=-1;
            }else{
                front++;
            }
        }
    }
}

int size(const array<string,10>&y)
{
    if(front==rear)
    {
        if(front==-1)
        {
            return 0;
        }else{
            return 1;
        }
    }else{
        int size=0;
        for(itr=ar_queue.begin();itr!=ar_queue.end();itr++)
        {
            if(*itr=="null")
            {
                continue;
            }
            size++;
        }
        return size;
    }
}

void back(const array<string,10>&y)
{
    if(front==-1 && rear==-1)
    {
        cout<<"EMPTY STRING";
    }else{
        cout<<ar_queue[rear];
    }
    
}

void Front(const array<string,10>&y)
{
    if(front==-1 && rear==-1)
    {
        cout<<"EMPTY STRING";
    }else{
        cout<<ar_queue[front];
    }
}

void empty(const array<string,10>&y)
{
    if(size(ar_queue)!=0)
    {
        cout<<0;
    }else{
        cout<<1;
    }
}

int main()
{
    push(ar_queue,"A");
    push(ar_queue,"B");
    push(ar_queue,"C");
    push(ar_queue,"D");
    push(ar_queue,"E");
    push(ar_queue,"F");
    push(ar_queue,"G");
    push(ar_queue,"H");
    push(ar_queue,"I");
    push(ar_queue,"J");
    for(itr=ar_queue.begin();itr!=ar_queue.end();itr++)
    {
        if(rear==-1 && front==-1)
        {
            cout<<"Queue is EMPTY"<<endl;
            break;
        }
        cout<<*itr<<" ";
    }
    pop(ar_queue);
    pop(ar_queue);
    pop(ar_queue);
    pop(ar_queue);
    pop(ar_queue);
    pop(ar_queue);
    cout<<endl;
    for(itr=ar_queue.begin();itr!=ar_queue.end();itr++)
    {
        if(*itr=="null")
        {
            continue;
        }
        cout<<*itr<<" ";
    }cout<<endl;
    
    cout<<"size : "<<endl;
    cout<<size(ar_queue)<<endl;
    cout<<"back : "<<endl;
    back(ar_queue);
    cout<<"front : ";
    Front(ar_queue);
    cout<<endl;
    empty(ar_queue);
}