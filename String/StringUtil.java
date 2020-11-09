package String;

import java.util.Arrays;

public class StringUtil {
    String value;
    StringUtil(String value){
        this.value = value;
    }

    public int length(){
        int count=0;
        char []array = value.toCharArray();

        for(int i=0;i<array.length;i++){
            count++;
        }
        return count;
    }

    public String toLowerCase(String data){
        String lowerCase="";
        char [] array = data.toCharArray();
        for(int i=0;i<array.length;i++){
            int ascii = (int)array[i]+32;
            lowerCase = lowerCase+String.valueOf((char)ascii);
        }
        return lowerCase;
    }

    public String toUpperCase(String data){
        String upperCase="";
        char [] array = data.toCharArray();
        for(int i=0;i<array.length;i++){
            int ascii = (int)array[i]-32;
            upperCase = upperCase+String.valueOf((char)ascii);
        }
        return upperCase;
    }

    public String toggleCase(String data){
        String toggleCase="";
        char [] array = data.toCharArray();
        for (int i=0;i<array.length;i++){
            int ascii = (int)array[i];
            if(ascii>=65 && ascii<=90){
                 ascii = (int)array[i]+32;
                toggleCase = toggleCase+String.valueOf((char)ascii);
            }
            else{
                ascii = (int)array[i]-32;
                toggleCase = toggleCase+String.valueOf((char)ascii);
            }

        }
        return toggleCase;
    }

    public void vowelsAndConsonant(String data){
        String vowels ="";
        String consonats ="";
        data = data.toLowerCase();
        char []array = data.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]=='a' || array[i]=='e'|| array[i]=='i'||array[i]=='o'||array[i]=='u'){
                vowels = vowels+String.valueOf(array[i]);
            }
            else{
                consonats = consonats+String.valueOf(array[i]);
            }
        }

        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonats);
    }

    public int numberOfWords(String data){
        int count =0;

        char []array = data.toCharArray();
        char lastChar=array[0];

        for (int i=1;i<array.length;i++){
            if(lastChar != ' ' && array[i]==' ')
                count++;
            lastChar = array[i];
        }
        return count+1;
    }

    public String reverse(String data){
        int i,j=data.length()-1;
        char []array = data.toCharArray();

        for(i=0;i<j;i++,j--){
            swap(i,j,array);
        }
        return Arrays.toString(array);
    }

    public void swap(int c1,int c2,char []array){
        char temp = array[c1];
        array[c1] = array[c2];
        array[c2] = temp;

    }

    public String subString(String data,int i, int j){
        String subString ="";
        if(j<i)
            j = data.length()-1;
        char []array = data.toCharArray();
        for (;i<=j;i++){
            subString = subString+String.valueOf(array[i]);
        }

        return subString;
    }

    public int indexOf(String data,char c){
        char [] array = data.toCharArray();

        for(int i=0;i<array.length;i++){
            if(array[i] == c)
                return i;
        }
      return -1;
    }

    public boolean areAnagrams(String s1, String s2){
        int []hash = new int[26];
        for(int i=0;i<s1.length();i++){
            int asciiValue = (int)s1.charAt(i);
            if(asciiValue>=65 && asciiValue<=90)
                hash[asciiValue-65]=1;
            else if(asciiValue>=97 && asciiValue<=122)
                hash[asciiValue-97]=1;
        }

        for (int j=0;j<s2.length();j++){
            int asciiValue =(int) s2.charAt(j);
            if(asciiValue>=65 && asciiValue<=90)
                if(hash[asciiValue-65] !=1)
                    return false;
            else if(asciiValue>=97 && asciiValue<=122)
                if(hash[asciiValue-97]!=1)
                    return false;
        }
        return true;
    }
    static int []flag = new int[6];
    static char []result = new char[6];
    public void permutations(char []input,int k){
        if(result.length == k)
            System.out.println(String.valueOf(result));
        else{
            for (int i=0;i<flag.length;i++){
                if(flag[i]==0){
                    result[k]=input[i];
                    flag[i]=1;
                    permutations(input,k+1);
                    flag[i]=0;
                }
            }
        }
    }


    public static void main (String []args){

        StringUtil string = new StringUtil("satya");
        System.out.println("Length: "+string.length());
        System.out.println("Lower Case: "+string.toLowerCase("SATYANARAYANA"));
        System.out.println("Upper Case: "+string.toUpperCase("umamaheswari"));
        System.out.println("Toggle Case: "+string.toggleCase("satyaUMA"));
        string.vowelsAndConsonant("satya");
        System.out.println("Number Of Words: "+string.numberOfWords("satya narayana    loves     uma maheswari"));
        System.out.println("Reverse: "+string.reverse("uma"));
        System.out.println("Sub String: "+string.subString("satya",0,2));
        System.out.println("Sub String: "+string.subString("satya",2,0));
        System.out.println("Index Of: "+string.indexOf("satya",'y'));
        System.out.println("Are Anagrams: "+string.areAnagrams("decimal","medical"));
        System.out.println("Permutations: ");
        string.permutations("STRING".toCharArray(),0);
    }
}
