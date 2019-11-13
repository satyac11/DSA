package Recursion;

import java.util.Scanner;

public class Power {

    public static int power(int m,int n){
        if(n==0)
            return 1;
        else{
            return power(m,n-1)*m;
        }
    }
    /* f(n)= 1 n=0
             (m*m)^n/2 n-is even
             m*(m*m)^n-1/2 n-is odd*/
    public static int optimizedPower(int m,int n){
        if(n==0)
            return 1;
        if(n%2==0)
            return optimizedPower(m*m,n/2);
        else
            return m*optimizedPower(m*m,(n-1)/2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base value:");
        int m = sc.nextInt();
        System.out.println("Enter power vale: ");
        int n = sc.nextInt();

        System.out.printf("%d power %d is: %d",m,n,optimizedPower(m,n));
    }
}
