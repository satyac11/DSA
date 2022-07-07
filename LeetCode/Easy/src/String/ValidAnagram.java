package String;

public class ValidAnagram {

    public static boolean isAnagram(String s,String t){
        int []arr = new int[26];
        char []chars = s.toCharArray();
        for(char c:chars)
            arr[c-'a']++;
        for(char othChar: t.toCharArray())
            arr[othChar-'a']--;
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                return false;

        return true;

    }

    public static boolean isAnagramBS(String s, String t){
        if(s.length()!=t.length())
            return false;
        int []sc = new int [26];
        int []tc = new int [26];
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            tc[t.charAt(i)-'a']++;
        }
        for(int i=0;i<sc.length;i++){
            if(sc[i]!=tc[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagramBS("rat","car"));
        System.out.println(isAnagramBS("anagram","nagaram"));
    }
}
