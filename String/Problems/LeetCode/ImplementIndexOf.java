package String.Problems.LeetCode;

public class ImplementIndexOf {

    static int indexOf(String haystack, String needle){
        int i=0,j=0,index=-1;
        if(needle.length()==0)
            return 0;


        while(j<haystack.length()&&i<needle.length()){
            if(index !=-1 && needle.charAt(i) != haystack.charAt(j))
                return -1;
            if(needle.charAt(i) == haystack.charAt(j)){
                if (index == -1)
                    index = j;
                i++;
                j++;
            }
            else{
                j++;
            }

        }

        return index;
    }


    //Working Solution
    public static int strStr(String haystack, String needle) {
        int m = haystack.length(), n= needle.length();
        if(n==0)
            return 0;
        if(m<n)
            return -1;

        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
            if(j==n)
                return i;

        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack ="mississippi";
        String needle ="issip";
        haystack.indexOf(needle);


        System.out.println("Index of: "+indexOf(haystack,needle));
        System.out.println("Index of: "+strStr(haystack,needle));

    }
}
