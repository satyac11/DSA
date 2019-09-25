package Sort;

import java.util.Arrays;

public class MergeSortAlgo {

    public static void main(String []args){
        int [] elements = {3,2,1,5,6,4};
        System.out.println("Before Sort: "+Arrays.toString(elements));
        mergeSort(elements);
        System.out.println("After Sort: "+Arrays.toString(elements));

    }

    private static void mergeSort(int []elements){
        int size = elements.length;
        if(size>=2){
            int mid = size/2;

            int []left = new int[mid];
            int []right = new int [size-mid];
            for(int i=0;i<mid;i++)//i->mid-1
                left[i]=elements[i];

            for(int j=mid;j<size;j++){//mid->size-1
                right[j-mid]=elements[j];
            }

            mergeSort(left);
            mergeSort(right);
            merge(left,right,elements);
        }

    }

    private static void merge(int []L,int []R,int []A){

        int i=0,j=0,k=0;
        while(i<L.length && j<R.length){
            if(L[i]<R[j]){
                A[k]= L[i];
                i++;
                k++;
            }
            else{
                A[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<L.length){
            A[k]= L[i];
            i++;
            k++;
        }
        while(j<R.length){
            A[k] = R[j];
            j++;
            k++;
        }

    }
}
