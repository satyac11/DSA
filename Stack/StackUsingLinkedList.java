package Stack;

public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
    }
    Node top=null;
    void push(int value){

        if(isFull())
            System.out.println("Stack is Full ");
        else{
            Node node = new Node();
            node.data = value;

            node.next = top;
            top = node;
        }
    }

    int pop(){
        int x =-1;
        if(isEmpty())
            System.out.println("Stack is Empty.");
        else{
            x = top.data;
            Node prev = top;
            top = top.next;
            prev.next = null;
        }
        return x;
    }

    int peek(int index){
        int x=-1;
        Node pointer = top;
        for(int i=0;pointer!=null && i<index;i++){
            pointer = pointer.next;
        }
        if(pointer == null)
            System.out.println("Invalid Index");
        else
            x= pointer.data;

        return x;
    }

    boolean isEmpty(){
        return top == null? true:false;
    }

    boolean isFull(){
    Node test = new Node();
    return test==null ?true:false;
    }

    void printLinkedList(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String []args){
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);

        stack.printLinkedList(stack.top);

        System.out.println("Stack is Empty "+stack.isEmpty());
        System.out.println("Poped Value "+stack.pop());
        System.out.println("Peek Value "+stack.peek(3));
        /*System.out.println("Stack is "+ Arrays.toString(stack1.array) );
        System.out.println("Top value: "+stack1.top);*/
    }

}
