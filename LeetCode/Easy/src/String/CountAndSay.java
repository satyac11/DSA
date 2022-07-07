package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSay {

    public static String countAndSay(int n){
        String output="1";
        if(n==1)
            return output;
        for(int i=1;i<n;i++){
            output =say(output);
        }
        return output;
    }

    public static String say(String op){
        StringBuilder output = new StringBuilder();
        int count=1;
        for(int i=0;i<op.length();i++){
            if((i+1)<op.length() && op.charAt(i)==op.charAt(i+1))
                count++;
            else{
                output.append(count);
                output.append(op.charAt(i));
                count=1;
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(10));
        /*System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));*/
    }

}
