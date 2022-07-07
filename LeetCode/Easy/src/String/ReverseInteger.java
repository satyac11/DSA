package String;

public class ReverseInteger {
    public static int reverseNumber(int number){
        long reverse=0;
        while(number!=0){
            reverse = reverse*10+number%10;
            number = number/10;
        }
        if(reverse>Integer.MAX_VALUE||reverse<Integer.MIN_VALUE)
            return 0;
        return (int)reverse;
    }
    //Best Solution
    public static int reverseValue(int number){
        int rev=0,rem;
        while(number !=0){
            rem = number%10;
            if(rev>Integer.MAX_VALUE/10)
                return 0;
            if(rev<Integer.MIN_VALUE/10)
                return 0;
            rev = (rev*10)+rem;
            number = number/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(2147483647));
        System.out.println(reverseNumber(-123));
        System.out.println(reverseValue(1534236469));
    }
}
