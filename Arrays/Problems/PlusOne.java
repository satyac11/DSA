package Arrays.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int []digits){
        int i = digits.length-1;
            if(digits[i] != 9){//if last digit is not 9 increment the value and return the array
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;//make last element as 0 and decrement index
                i--;
                while(i>=0){//repeat this till index reaches 0
                    if(digits[i] != 9){//Again if last but one digit is not 9 increment the value and return the array
                        digits[i]++;
                        return digits;
                    }
                    else{
                        digits[i]=0; //make last but one element as 0 and decrement index
                        i--;
                    }

                }
                if(digits[0]==0){//if first element is zero then increase the size of array and insert 1 at 0th position and 0 at remaining places
                    digits = new int[digits.length+1];
                    digits[0]=1;
                    for(int j=1;j<digits.length;j++){
                        digits[j]=0;
                    }
                }
            }
    return digits;

    }


    public static void main(String []args){
        int []digits = {9,9,9};
        System.out.println("Plus One: "+Arrays.toString(plusOne(digits)));
    }
}
