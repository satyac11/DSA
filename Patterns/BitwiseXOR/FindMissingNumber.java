package Patterns.BitwiseXOR;

public class FindMissingNumber {

    static int getMissingNumber(int arr[]){
        int n = arr.length+1;

        int x1=1;
        for(int i=2;i<=n;i++){
                x1 = x1^i;
        }

        int x2 = arr[0];
        for(int j=1;j<n-1;j++){
            x2= x2^arr[j];
        }
        return x1^x2;
    }

    public static void main(String []args){
        System.out.println(getMissingNumber(new int[]{1,5,2,6,4}));

    }
}
