package Queue;

public class QueueLinkedList {
    static class Node{
        int data;
        Node next;
    }
    Node front;
    Node rear;
    public boolean isEmpty(){
        return front == null?true:false;
    }

    public void enqueue(int value){
        Node node = new Node();
        node.data = value;

        if(isEmpty()){
            node.next = null;
            front = node;
            rear = node;
        }
        else{
            rear.next =node;
            rear = node;
        }

    }

    public int dequeue(){
        int x=-1;
        Node temp;
        if(isEmpty())
            System.out.println("Queue is Empty");
        else{
            x = front.data;
            temp = front;
            front = front.next;
            temp.next = null;
            return x;

        }
        return x;
    }

    public void displayQueue(){
        Node pointer = front;
        while(pointer !=null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public static void main(String []args){
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Deleted: "+queue.dequeue());
        queue.displayQueue();

    }
}
