package String;

public class StringToInteger {

    public static int myAtoi(String s){
        if(Character.isAlphabetic(s.charAt(0)))
            return 0;
        s =s.replaceAll("[^0-9+-]","");
        int num=0;
        if(s.charAt(0)=='-'){
            for(int i=1;i<s.length();i++){
                if(num<Integer.MIN_VALUE/10)
                    return Integer.MIN_VALUE;
                num = num*10+s.charAt(i)-'0';
            }
            return -num;
        }else{
            for(int i=0;i<s.length();i++){
                if(num>Integer.MAX_VALUE/10)
                    return Integer.MAX_VALUE;
                num = num*10+s.charAt(i)-'0';
            }
            return num;
        }

    }
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("asdfasdf 4193 with words"));


    }
}
