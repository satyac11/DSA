package String.String.Problems;


import java.util.regex.PatternSyntaxException;

/*criteria:

        Its length is at least .
        It contains at least one digit.
        It contains at least one lowercase English character.
        It contains at least one uppercase English character.
        It contains at least one special character. The special characters are: !@#$%^&*()-+*/
public class PasswordValidation {


    public int passwordValidate(String password){
        int count =0;
        if(!containsLowerCase(password)){
            count++;
        }
        if(!containsUpperCase(password)){
           count++;
        }
        if(!containsSpecialCharacters(password)){
           count++;
        }
        if(!containsNumbers(password)){
           count++;
        }
        if ((count+password.length())<6) {
            count = count + 6-(count+password.length());
        }
        return count;
    }

    public boolean containsLowerCase(String password){
        for (int i=0;i<password.length();i++){
            int ascii = (int) password.charAt(i);
            if(ascii>=97 && ascii<=122)
                return true;
        }
        return false;
    }

    public boolean containsUpperCase(String password){
        for (int i=0;i<password.length();i++){
            int ascii = (int) password.charAt(i);
            if(ascii>=65 && ascii<=90)
                return true;
        }
        return false;
    }

    public boolean containsSpecialCharacters(String password){
        String specialCharacters ="!@#$%^&*()-+";
        for(int i=0;i<specialCharacters.length();i++){
            if(password.contains(String.valueOf(specialCharacters.charAt(i))))
                return true;
        }
        return false;
    }

    public boolean containsNumbers(String password){
        for (int i=0;i<password.length();i++){
            int ascii = (int)password.charAt(i);
            if(ascii>=48 && ascii<=57)
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        PasswordValidation psv = new PasswordValidation();
        System.out.print(psv.passwordValidate("4700"));
    }
}
