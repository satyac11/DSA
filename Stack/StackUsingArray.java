package Stack;

import java.util.Arrays;

public class StackUsingArray {
    int top=-1;
    int array[];

    StackUsingArray(int size){
        array = new int[size];
    }

    void push(int value){
        if(isFull())
            System.out.println("Stack is Full...");
        else{
            top++;
            array[top] = value;
        }
    }

    int pop(){
        int x=-1;
        if(isEmpty())
            System.out.println("Stack is Empty...");
        else{
            x = array[top];
            top--;
        }
        return x;
    }

    int peek(int index){
        int x = -1;
        int position =top-index+1;
        if(position<0)
            System.out.println("Invalid Index");
        else{
            x = array[position];
        }
        return x;
    }

    boolean isEmpty(){
        return top<0?true:false;
    }

    boolean isFull(){
        return top==array.length-1?true:false;
    }

    public static void main(String args[]){
        StackUsingArray stack1 = new StackUsingArray(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        System.out.println("Stack is Full "+stack1.isFull());
        System.out.println("Stack is Empty "+stack1.isEmpty());
        System.out.println("Poped Value "+stack1.pop());
        System.out.println("Peek Value "+stack1.peek(3));
        System.out.println("Stack is "+ Arrays.toString(stack1.array) );
        System.out.println("Top value: "+stack1.top);


    }
}
