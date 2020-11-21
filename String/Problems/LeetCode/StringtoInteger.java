package String.Problems.LeetCode;


//Problem Description

/*Implement atoi which converts a string to an integer.

        The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

        The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

        If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

        If no valid conversion could be performed, a zero value is returned.

        Note:

        Only the space character ' ' is considered a whitespace character.
        Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.


        Example 1:

        Input: str = "42"
        Output: 42
        Example 2:

        Input: str = "   -42"
        Output: -42
        Explanation: The first non-whitespace character is '-', which is the minus sign. Then take as many numerical digits as possible, which gets 42.
        Example 3:

        Input: str = "4193 with words"
        Output: 4193
        Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
        Example 4:

        Input: str = "words and 987"
        Output: 0
        Explanation: The first non-whitespace character is 'w', which is not a numerical digit or a +/- sign. Therefore no valid conversion could be performed.
        Example 5:

        Input: str = "-91283472332"
        Output: -2147483648
        Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer. Thefore INT_MIN (−231) is returned.


        Constraints:

        0 <= s.length <= 200
        s consists of English letters (lower-case and upper-case), digits, ' ', '+', '-' and '.'.*/

import java.security.spec.ECField;

public class StringtoInteger {

    public static int myAtoi(String s) {
        s= stripLeading(s);
        if(s.length()<1)
            return 0;
        boolean negative = false;
        long out =0;

        char c = s.charAt(0);
        if(c=='-')
            negative = true;
        else if(c =='+')
            negative = false;
        else if(!isNumeric(c))
            return 0;
        else
            out = c -'0';//"character - 48(0 ascii value)"

        for(int i=1;i<s.length();i++){
            char c1 = s.charAt(i);
            if(isNumeric(c1)){
                out = out*10 + (c1-'0');

                if(!negative && out>=Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if(negative && out >Integer.MAX_VALUE)
                    return Integer.MIN_VALUE;
            }
            else
                break;
        }

        if(negative)
            return -(int) out;
        else
            return (int)out;



}

    static boolean isNumeric(char c){
        if(c>='0' &&c<='9')
            return true;
        else
            return false;
    }

    static String stripLeading(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')
                continue;
            return str.substring(i);
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "  -42";
        //s= "4193 with words";
       //s="words and 987";
        //s="-91283472332";
       // s = "2147483649";
        //s="-91283472332";
        //s="   +0 123";
        //s="-2147483647";

        System.out.println("String Integer Conversio: "+myAtoi(s));

    }
}
