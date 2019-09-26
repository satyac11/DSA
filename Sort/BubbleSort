package com.sort.algos;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int []array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String []args){
        int []array = {9,3,2,1,5,8,6,4,7};
        System.out.println("Before Sorting: "+Arrays.toString(array));
        sort(array);
        System.out.println("After Sorting: "+Arrays.toString(array));
    }
}
