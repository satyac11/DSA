package Queue;

import java.util.Arrays;

public class CircularQueue {
    int []array;
    int front,rear;
    CircularQueue(int size){
        array = new int[size];
    }

    public boolean isEmpty(){
        return front==rear?true:false;
    }

    public boolean isFull(){
        return ((rear+1)%array.length == front)?true:false;
    }

    public void enqueue(int x){
        if(isFull())
            System.out.println("Queue is Full");
        else{
            rear = (rear+1)%array.length;
            array[rear]=x;
        }
    }

    public int dequeue(){
        int x=-1;
        if(isEmpty())
            System.out.println("Queue is Empty");
        else{
            front = (front+1)%array.length;
            x= array[front];
            array[front]=0;
          return x;
        }
        return x;
    }

    public void displayCircularQueue(){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String  []args){
        CircularQueue cqueue = new CircularQueue(5);
        cqueue.enqueue(1);
        cqueue.enqueue(2);
        cqueue.enqueue(3);
        cqueue.enqueue(4);
        cqueue.enqueue(5);
        cqueue.dequeue();
        cqueue.enqueue(5);

        cqueue.displayCircularQueue();
        System.out.println("Front: "+cqueue.front+" Rear: "+cqueue.rear);
    }


}
