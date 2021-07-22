package Patterns.PatternCyclicSort;

import java.util.Arrays;

public class CyclicSort {

    static void sort(int []array){
        int i =0;
        while(i<array.length){
            /*while(i+1!= array[i]){
                int value = array[i];
                swap(array,i,value-1);
            }
            i++;*/
            int j = array[i]-1;
            if(array[i] != array[j])
                swap(array,i,j);
            else
                i++;
        }
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }
    static void swap(int []array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        sort(new int[]{3, 1, 5, 4, 2});
        sort(new int[]{2, 6, 4, 3, 1, 5});
        sort(new int[]{1, 5, 6, 4, 3, 2});
    }
}
