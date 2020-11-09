package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ParanthesisMatching {



    boolean isBalanced(String str){
        StackUsingArray stack = new StackUsingArray(str.length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
                stack.push(str.charAt(i));
            else if(str.charAt(i)==')'){
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }

        return stack.isEmpty() ? true:false;
    }

    boolean multipleParanthesisBalanced(String str){
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='(' || str.charAt(i)=='['||str.charAt(i)=='{')
                stack.push(str.charAt(i));
            else if(str.charAt(i)==')' || str.charAt(i)==']'||str.charAt(i)=='}'){
                if(stack.isEmpty())
                    return false;
                else{

                    if(str.charAt(i)==')'){
                        char c = stack.pop();
                        if(c != '(')
                            return false;
                    }
                    else if(str.charAt(i)==']'){
                        char c = stack.pop();
                        if(c != '[')
                            return false;
                    }
                    else if(str.charAt(i)=='}'){
                        char c = stack.pop();
                        if(c != '{')
                            return false;
                    }
                }
            }
        }
        return stack.isEmpty() ? true:false;
    }


    public static void main(String []args){
        ParanthesisMatching test = new ParanthesisMatching();
        System.out.println("Enter a string to check Pranthesis Matching: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        System.out.println("Is Balanced: "+test.multipleParanthesisBalanced(value));
    }
}
