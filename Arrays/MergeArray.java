package Arrays;

import java.util.Arrays;

public class MergeArray {
    public static int[] merge(int []A,int []B){
        int i=0,j=0,k=0;
        int []a = new int[A.length+B.length];

        while(i<A.length&&j<B.length){
            if(A[i]<B[j]){
                a[k] = A[i];
                i++;
                k++;
            }
            else{
                a[k] = B[j];
                j++;
                k++;
            }
        }

        while(i<A.length){
            a[k] = A[i];
            i++;
            k++;
        }
        while(j<B.length){
            a[k] = B[j];
            j++;
            k++;
        }
        return a;
    }


    public static void main(String args[]){
        int []A = {1,3,4,5,6,10};
        int []B = {2,7,8,9};

        System.out.println("After Merging: "+ Arrays.toString(merge(A,B)));
    }
}
