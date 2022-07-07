package String;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String s){

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidPalindrome("race a car"));
        System.out.println(isValidPalindrome(" "));
        System.out.println("4193 with words".replaceAll("[^0-9+-]",""));
    }
}
