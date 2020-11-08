package Arrays;

import java.util.Arrays;

public class EvenFirst {

    public static void sortEvenFirst(int arr[]){
        int i,j=0;

        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;
            }
        }

    }


    public static void evenOdd(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
    }
    public static void main(String args[]){
        int []arr = {1,2,3,4,5,6,7,8,9};
        /*sortEvenFirst(arr);
        System.out.println("After re-arrangement: "+ Arrays.toString(arr));*/
        evenOdd(arr);
        System.out.println("After re-arrangement: "+ Arrays.toString(arr));
    }

}
