package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumOfNumbers(int n){
        if(n==0)
            return 0;
        else
            return sumOfNumbers(n-1)+n;
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a value to find it's some of N numbers:");
        int n = sc.nextInt();
        System.out.printf("Sum of %d natural numbers is: %d",n,sumOfNumbers(n));
    }
}
