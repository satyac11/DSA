package Patterns.Subsets;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsByChangingCase {

    static List<String> findPermutations(String str){
        List<String> permutations = new ArrayList<>();
        permutations.add(str);
        for(int k=0;k<str.length();k++){
            if(isChar(str.charAt(k))){
                int n = permutations.size();
                for(int i=0;i<n;i++){
                    String permutation = permutations.get(i);
                    char ch = permutation.charAt(k);
                    if(isChar(ch))
                        permutation = capitalizeString(permutation,k);
                    permutations.add(permutation);
                }
            }
        }

        return permutations;
    }

    static boolean isChar(char ch){
        if(ch>='a' && ch<='z')
            return true;
        else
            return false;
    }
    static String capitalizeString(String str,int index){
        StringBuffer upperCaseString =new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(i==index)
                upperCaseString.append((char)(str.charAt(i)-32));
            else
                upperCaseString.append(str.charAt(i));

        }
       return upperCaseString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Permutations: "+findPermutations("ad52"));
        System.out.println("Permutations: "+findPermutations("ab7c"));
    }
}
