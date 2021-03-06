package String.Problems.LeetCode;

//Problem Description

/*Given a 32-bit signed integer, reverse digits of an integer.

        Note:
        Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.



        Example 1:

        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21
        Example 4:

        Input: x = 0
        Output: 0


        Constraints:

        -231 <= x <= 231 - 1*/

public class ReverseInteger {


    public static int reverse(int x) {
        long r = reverseValue(x);
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE)
            return 0;
        else
            return (int) r;

    }

    static long reverseValue(int x){
        long r=0;
        while(x!=0){
            r = (r*10)+(x%10);
            x = x/10;
        }
        return r;

    }

    public static void main(String[] args) {
        int x=-123;
        //x = 123;
        //x = 0;
        //x=-2147483648;
       // x=1534236469;

        System.out.println(reverse(x));
    }
}
