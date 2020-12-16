package Design;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    int min;
    int top;
    List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        top =-1;
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        list.add(x);
        top++;

    }

    public void pop() {
        list.remove(list.size()-1);
        top--;

    }

    public int top() {
        return list.get(top);

    }

    public int getMin() {
        min = Integer.MAX_VALUE;
        if(list.size()<0)
            return -1;
        for(int value: list){
            if(value<min)
                min = value;
        }
        return min;

    }


    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println("Get Min: "+stack.getMin());
        stack.pop();
        System.out.println("Top "+stack.top);
        System.out.println("Get Min: "+stack.getMin());
    }
}

//Excelent Approach Kudos
/*class Result{
    public int value;
    public int mini;
    public Result next;
    public Result(int value,int mini){
        this.value = value;
        this.mini = mini;
    }
}

class MinStack {

    public Result top;

    *//** initialize your data structure here. *//*
    public MinStack() {}

    public int getMin(int a,int b){
        return a<b ? a : b;
    }

    public void push(int x) {
        if(top==null){
            top = new Result(x,x);
        } else {
            Result temp = new Result(x,getMin(x,top.mini));
            temp.next = top;
            top = temp;
        }
    }

    public void pop() {
        if(top == null)
            return;
        Result temp = top.next;
        top.next = null;
        top = temp;
    }

    public int top() {
        if(top == null)
            return -1;
        return top.value;
    }

    public int getMin() {
        if(top == null)
            return -1;
        return top.mini;
    }
}*/
