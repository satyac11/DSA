package Math;

import java.util.Stack;

public class SmallestNumber {
    static long smallestNumberK(int n) {
        // if 'n' is a single digit number, then
        // it is the required number
        if (n >= 0 && n <= 9) {
            return n;
        }

        // stack the store the digits
        Stack<Integer> digits = new Stack<>();

        // repeatedly divide 'n' by the numbers
        // from 9 to 2 until all the numbers are
        // used or 'n' > 1
        for (int i = 9; i >= 2 && n > 1; i--) {
            while (n % i == 0) {
                // save the digit 'i' that divides 'n'
                // onto the stack
                digits.push(i);
                n = n / i;
            }
        }

        // if true, then no number 'k' can be formed
        if (n != 1) {
            return -1;
        }

        // pop digits from the stack 'digits'
        // and add them to 'k'
        long k = 0;
        while (!digits.empty()) {
            k = k * 10 + digits.peek();
            digits.pop();
        }

        // required smallest number
        return k;
    }

    // Driver program to test above
    static public void main(String[] args) {
        int n = 100;
        System.out.println(smallestNumberK(n));
    }
}
