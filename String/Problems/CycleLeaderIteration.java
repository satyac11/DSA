package String.Problems;

public class CycleLeaderIteration {

    public String getAlphaNumericString(String value){
        int i=0,j=value.length()-1;
        while(i<j){
            if(isCharacter(value.charAt(i)) && isCharacter(value.charAt(j)))
                i++;
            else if(isNumber(value.charAt(i)) && isCharacter(value.charAt(j))){
                value = swap(i,j,value);
                i++;
                j--;
            }
            else if(isCharacter(value.charAt(i))&& isNumber(value.charAt(j))){
                i++;
                j--;
            }
            else{
                j--;
            }
        }
        return value;
    }

    public String swap(int i, int j, String value){
        char []array = value.toCharArray();
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return String.valueOf(array);
    }

    public boolean isCharacter(char c){
        int ascii = (int)c;
        if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122))
            return true;
        else
            return false;
    }

    public boolean isNumber(char c){
        int ascii = (int)c;
        if(ascii>=48 && ascii<=57)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        CycleLeaderIteration cli = new CycleLeaderIteration();
        System.out.println("AlphaNumeric String: "+cli.getAlphaNumericString("1a2b3c4d5e6f7g8h9iAjBkClDmEn"));
    }
}
