package String;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String []strs){
        if(strs.length==1)
            return strs[0];
        String prev=strs[0];
        for(int i=1;i<strs.length;i++){
            String current = strs[i];
            StringBuilder temp=new StringBuilder();
            int j=0,k=0;
            while(j<prev.length()&&k<current.length()){
                if(prev.charAt(j)==current.charAt(k)){
                    temp.append(prev.charAt(j));
                    j++;
                    k++;
                }
                else
                    break;

            }
            if(temp.length()>0)
                prev = temp.toString();
            else
                return "";


        }
        return prev;
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }
}
