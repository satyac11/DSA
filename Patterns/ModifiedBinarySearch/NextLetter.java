package Patterns.ModifiedBinarySearch;

public class NextLetter {

    static char searchNextLetter(char []arr,char key){
        int start =0,end = arr.length-1;

        if(key<arr[0] || key>arr[arr.length-1])
            return arr[0];
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]>key)
                end =mid-1;
            else
                start = mid+1;
        }
        return arr[start%arr.length];


    }

    public static void main(String[] args) {

        System.out.println(searchNextLetter(new char[]{'a','c','f','h'},'f'));
        System.out.println(searchNextLetter(new char[]{'a','c','f','h'},'b'));
        System.out.println(searchNextLetter(new char[]{'a','c','f','h'},'m'));
        System.out.println(searchNextLetter(new char[]{'a','c','f','h'},'h'));

    }
}
