package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    static int n =5;
    //BottomUp Dynamic Programming
    //Time Complexity is O(n)
    private static void bottomUpFib(int n){

        int []fib = new int [n];
        System.out.println("Fib array length is: "+fib.length);
        fib[0] = 1;
        fib[1] = 1;
        for(int i=2;i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        System.out.printf("Fibonacci series of %d is: %s",n, Arrays.toString(fib));
    }

    //Top Down Dynamic Programming
    //Time complexity is O(n)
    static int [] fib = new int[n];
    private static int topDownFib(int n){
        if(n==0 || n==1)
            return 1;
        if(fib[n] !=0)
            return fib[n];
        return fib[n] = topDownFib(n-1)+topDownFib(n-2);
    }

    public static void main(String [] args){

        bottomUpFib(5);

        n=6;
        fib = new int[n];
        System.out.printf("Fibonacci series of %d is:",n);
        for (int i=0;i<n;i++){
            System.out.printf("%d ",topDownFib(i));
        }


    }
}
