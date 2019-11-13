package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        if(n==1)
            return 1;
        else return factorial(n-1)*n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to know it's factorial: ");
        int n = sc.nextInt();

        System.out.printf("Factorial of %d is %d",n,factorial(n));
    }
}
