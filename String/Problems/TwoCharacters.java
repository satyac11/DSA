package String.Problems;

import java.util.Arrays;

public class TwoCharacters {

    public int getTwoCharsString(String value){

        String uniqueChars = getUniqueCharString(value);
        String []strArray = new String[uniqueChars.length()];

        for(int i=0;i<uniqueChars.length();i++){
            char c = value.charAt(i);
            String strAfterCharRemove = removeCharFromString(c,value);
            strArray[i] = getValidString(strAfterCharRemove);
        }
        System.out.println(Arrays.toString(strArray));
        int max =0;
        for(int j=0;j<strArray.length;j++){
            if(strArray[j].length()>max)
                max = strArray[j].length();
        }

        return max;
    }

    public String getUniqueCharString(String word){
        String str = "";
        for(int i=0;i<word.length();i++){
            if(!str.contains(String.valueOf(word.charAt(i))))
                str = str+String.valueOf(word.charAt(i));
        }
        return str;
    }

    public String removeCharFromString(char c, String word){
        StringBuilder str = new StringBuilder();
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)!= c)
                str.append(word.charAt(i));
        }

        return str.toString();
    }

    public String getValidString(String value){
        if(hasConsecutiveChars(value))
            return "";
        else
            return value;
    }

    public boolean hasConsecutiveChars(String word){
        for (int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1))
                return true;
        }
        return false;
    }


    public static void main(String args[]){
        TwoCharacters twc = new TwoCharacters();
        System.out.println(twc.getTwoCharsString("beabeefeab"));
    }
}
