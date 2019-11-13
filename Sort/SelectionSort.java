package com.sort.algos;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int []array){
        for(int i=0;i<array.length-1;i++){
            //int min=array[i];
            int minIndex=array[i];
            for(int j=i+1;j<array.length;j++){
                if(array[j]<minIndex){
                    //min = array[j];
                    minIndex = j;
                }
            }
           // if(minIndex != array[i]){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex]= temp;
           // }

        }
    }

    public static void main(String []args){
        int []array = {9,3,2,1,5,8,6,4,7};
        System.out.println("Before Sorting: "+ Arrays.toString(array));
        sort(array);
        System.out.println("After Sorting: "+Arrays.toString(array));
    }
}
