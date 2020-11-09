package String.String.Problems;


/*Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

        It is a concatenation of one or more words consisting of English letters.
        All letters in the first word are lowercase.
        For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
        Given , print the number of words in  on a new line.

        For example, . There are  words in the string.*/

public class CamelCase {

    static int count=0;
    public static int getWordCount(String s){
        if(s.length()>0)
            count =1;
        for(int i=0;i<s.length();i++){
            int ascii = (int)s.charAt(i);
            if(ascii>=65 && ascii<=90)
                count = count+1;
        }

        return count;
    }

    public static void main(String args[]){
        System.out.print("Number of words are: "+getWordCount("saveChangesInTheEditor"));
    }
}
