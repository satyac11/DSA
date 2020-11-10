package String.Problems;


/*
Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length by doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string aab could be shortened to b in one operation.

        Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print Empty String
*/

public class SuperReducedString {

    public static String getReducedString(String s){

        while (true) {
            // Used for loop termination
            int len = s.length();

            // "(.)" is a capturing group that captures any character
            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
            s = s.replaceAll("(.)\\1", "");

            // If no changes were made to string, break loop
            if( s.length() == len ){
                break;
            }
        }

        //System.out.println( (s.isEmpty()) ? "Empty String" : s);
        return (s.isEmpty()) ? "Empty String" : s;

        /*for(int i=1;i<data.length();i++){
            if(data.charAt(i) == data.charAt(i-1)){
                data = data.substring(0,i-1)+data.substring(i+1);
                i=0;
            }
        }

        if(data.length()>0)
            return data;
        else
            return "Empty String";*/
    }/*{
        String result="";
        int j=1;
        for(int i=0;i<data.length();i++){
            if(j<data.length()-1){
                if(data.charAt(i)==data.charAt(j)){
                    i=i+1;
                    j=j+2;

                }
                else{
                    result = result+String.valueOf(data.charAt(i));
                    j++;
                }
            }
            else if(i == data.length()-1)
                result = result+String.valueOf(data.charAt(i));



            *//*if(i==data.length()-1)
                result = result+String.valueOf(data.charAt(i));*//*
        }
        if(result.length()>1)
            return result;
        else
            return "Empty";
    }*/


    public static void main(String []args){
        System.out.println("Reduced String: "+getReducedString("aabcddd"));
        System.out.println("Reduced String: "+getReducedString("baab"));
    }
}
