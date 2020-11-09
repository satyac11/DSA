package Queue;

import java.util.Arrays;

public class QueueUsingArray {
    int []array;
    int front=-1,rear=-1;

    QueueUsingArray(int size){
        array = new int[size];
    }

    public boolean isFull(){
        return rear==array.length-1?true:false;
    }

    public boolean isEmpty(){
        return front == rear? true:false;
    }

    public void enqueue(int value){
        if(isFull())
            System.out.println("Queue is Full");
        else{
            rear++;
            array[rear] = value;
        }
    }

    public int dequeue(){
        int x=-1;
        if(isEmpty())
            System.out.println("Queue is Empty");
        else{
            front++;
            x = array[front];
            array[front]=0;
            return x;
        }
        return x;
    }

    public void displayQueue(){
    System.out.println("Queue: "+Arrays.toString(array));
        ;
    }

    public static void main(String args[]){
        QueueUsingArray queue = new QueueUsingArray(5);
        System.out.println("is Empty: "+queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.displayQueue();
        System.out.println("is Full: "+queue.isFull());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        System.out.println("delete: "+queue.dequeue());
        queue.displayQueue();
    }
}
