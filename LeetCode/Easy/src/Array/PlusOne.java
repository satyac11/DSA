package Array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOneBF(int []digits){
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }

        int carry =0;
        for(int i =digits.length-1;i>=0;i--){
            int digit = digits[i];
            if(digit==9){
                carry =1;
                digits[i]=0;
            }
            else{
                digits[i]+=carry;
                return  digits;
            }
        }
        if(carry>0){
            digits = new int[digits.length+1];
            digits[0] =carry;
            for(int i=1;i<digits.length;i++)
                digits[i]=0;
        }
        return digits;
    }

    public static int[] plusOne(int[] digits) {


        int len = digits.length;
        for(int i = len-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] newArray = new int[len+1];
        newArray[0] = 1;
        return newArray;
    }
    public static void main(String[] args) {
        int []digits = {9,9,9};
        System.out.println("Plus One: "+ Arrays.toString(plusOne(digits)));
        System.out.println("Plus One: "+ Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println("Plus One: "+ Arrays.toString(plusOne(new int[]{1,9,9})));


    }
}
