package Patterns.BitwiseXOR;

public class SingleNumber {

    static int findSingleNumber(int []arr){
        int x = arr[0];

        for(int i=1;i<arr.length;i++){
            x = x^arr[i];
        }

        return x;

    }
   /* static char findUniqueChar(String word){
        int unique = 0;
        char []chars = word.toCharArray();
        for(char character: chars){
            unique = unique ^ character;
        }
        return (char)unique;
    }*/

    public static void main(String args[]){
        System.out.println(findSingleNumber(new int[]{1,4,2,1,3,2,3}));
        System.out.println(findSingleNumber(new int[]{7,9,7}));
       // System.out.println(findUniqueChar("satyasy"));

    }
}
