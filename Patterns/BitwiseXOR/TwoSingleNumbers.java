package Patterns.BitwiseXOR;

import java.util.Arrays;

public class TwoSingleNumbers {

    public static int[] findSingleNumbers(int arr[]){
        int n1xn2=0;
        for(int num:arr)
            n1xn2 =n1xn2^num;

        int rightMostSetBit =1;
        while((rightMostSetBit & n1xn2)==0)
            rightMostSetBit = rightMostSetBit<<1;

        int num1=0,num2=0;
        for(int number:arr){
            if((rightMostSetBit & number)!=0)
                num1= num1^number;
            else
                num2 = num2^number;
        }

        return new int[]{num1,num2};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSingleNumbers(new int[]{2,1,3,2})));
        System.out.println(Arrays.toString(findSingleNumbers(new int[]{1,4,2,1,3,5,6,2,3,5})));
    }

}
