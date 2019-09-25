package Sort;

import java.util.Arrays;

public class QuickSortAlog {
    public static void main(String []args){
        int [] elements = {2,1,3,6,7,8,5,4};
        System.out.println("Before Sort: "+ Arrays.toString(elements));
        QuickSort(elements,0,elements.length-1);
        System.out.println("After Sort: "+Arrays.toString(elements));
    }

    public static void QuickSort(int []elements, int start, int end){
        if(start<end) {
            int pindex = partition(elements, start, end);
            QuickSort(elements, start,pindex-1);
            QuickSort(elements,pindex+1,end);
        }
    }

    public static int partition(int []array,int start,int end){
        int pivot = array[end];
        int pIndex = start;

        for(int i=start;i<end;i++){
            if(array[i]<=pivot){
                swap(array,i,pIndex);
                pIndex++;
            }
        }
        swap(array,pIndex,end);
        return pIndex;
    }
    private static void swap(int[]A,int p1, int p2){
        int temp = A[p1];
        A[p1] = A[p2];
        A[p2] = temp;
    }
}
