package String;

public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if(haystack.length()<needle.length())
            return -1;
        int index = -1;
       for(int i=0;i<haystack.length();i++){
            int j=0;
            if(haystack.charAt(i)!=needle.charAt(j))
                continue;
            else{
                if(index ==-1)
                    index=i;
                int from =i;
                while(from<haystack.length() && j<needle.length()){
                    if(haystack.charAt(from)!=needle.charAt(j))
                        break;
                    i++;
                    j--;
                }
                return index;
            }
        }
       return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("hello","lo"));
        System.out.println(strStr("",""));
        System.out.println(strStr("aaaaa","bba"));
        System.out.println(strStr("mississippi","issip"));


    }
}
