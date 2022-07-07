package String.Problems.LeetCode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //System.out.println(s);
        //String reverse = new StringBuilder(s).reverse().toString();
        String reverse = reverse(s.toCharArray());
        //System.out.println("Reversed String: "+reverse);
        if (s.equals(reverse))
            return true;
        else
            return false;

    }


    static String reverse(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return String.valueOf(s);
    }

    //Two Pointer Solution
    public static boolean isPalindrome1(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    //Best Solution

    static boolean isAlphaNumeric(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c>='0' && c<='9')
            return true;
        return false;
    }

    //using no libraries
    public static boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1;
        s= s.toLowerCase();
        while (i < j) {
            if (!isAlphaNumeric(s.charAt(i)))
                i++;
            if (!isAlphaNumeric(s.charAt(j)))
                j--;

            if (isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(j))) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }


        }
        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: PanamaA man, a plan, a canal: Panama";
        s="race a car";
        System.out.println("Is Palindrome: " + isPalindrome(s));
        System.out.println("Is Palindrome: " + isPalindrome1(s));
        System.out.println("Is Palindrome: " + isPalindrome2(s));
    }
}
