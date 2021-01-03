package Patterns.Fast_SlowPointers;

public class HappyNumber {
    static boolean isHappyNumber(int num){
        int slow=num;
        int fast = num;
        do{
             slow = findSquareOfNumber(slow);
             fast = findSquareOfNumber(findSquareOfNumber(fast));

        }while(slow != fast);
        return slow==1;
    }

    static int findSquareOfNumber(int num){
        int sum =0;
        while(num>0){
            int remainder = num%10;
            sum = sum+(remainder*remainder);
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("12 Is Happy Number: "+isHappyNumber(12));
        System.out.println("23 Is Happy Number: "+isHappyNumber(23));

    }
}
