package Heap;

import java.util.Arrays;

public class Heap {

    public static void insertInMinHeap(int[] arr, int position) {
        int temp = arr[position];
        int i = position;
        while (i > 1 && temp < arr[i / 2]) {
            arr[i] = arr[i / 2];
            i = i / 2;
        }
        arr[i] = temp;
    }

    public static void insertInMaxHeap(int arr[], int n) {
        int i = n, value = arr[n];

        while (i > 1) {
            //i=n/2;
            if (value > arr[i / 2]) {
                arr[i] = arr[i / 2];
                i = i / 2;
            } else
                break;

        }
        arr[i] = value;
    }

    public static void createMaxHeap(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertInMaxHeap(arr, i);
        }
        System.out.println("Max Heap: " + Arrays.toString(arr));
    }

    public static void createMinHeap(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            insertInMinHeap(arr, i);
        }
        System.out.println("Min Heap: " + Arrays.toString(arr));
    }

    public static void delete(int arr[],int n){
        int value,i=1,j=2*i;
        value = arr[i];
        arr[i] = arr[n];
        while(j<n-1){
            if(arr[j+1]>arr[j])
                j=j+1;
            if(arr[i]<arr[j]){
                swap(arr,i,j);
                i=j;
                j=2*i;
            }
            else
                break;
        }
        arr[n]= value;//storing value for heap sort
    }

    public static void swap(int []arr,int i, int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapSort(int []arr){

        for(int i=arr.length-1;i>1;i--){
            delete(arr,i);

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 30, 20, 15, 5, 10, 12, 6, 40};
        //insert(arr,arr.length-1);
        System.out.println("Max Heap: " + Arrays.toString(arr));
        insertInMaxHeap(arr, arr.length - 1);
        System.out.println("Max Heap: " + Arrays.toString(arr));
        createMaxHeap(new int[]{0, 30, 20, 15, 10, 12, 5, 6, 40});
        int[] arr1 = new int[]{0, 30, 20, 15, 5, 10, 12, 6};
        //delete(arr1,arr1.length-1);
        //System.out.println(Arrays.toString(arr1));
        heapSort(arr1);
        System.out.println(Arrays.toString(arr1));
        createMaxHeap(new int[]{0,1,3,11,5});
        createMinHeap(new int[]{0,1,3,11,5});


    }
}
