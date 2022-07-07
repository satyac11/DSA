package Patterns.ModifiedBinarySearch;

public class SearchBitonicArray {

    static int bitonicSearch(int []arr,int key){
    int maxIndex = findMaxElementIndex(arr);
    int keyIndex = search(arr,0,maxIndex,key);
    if(keyIndex>=0)
        return keyIndex;
    return search(arr,maxIndex+1,arr.length-1,key);



    }
    static int findMaxElementIndex(int []arr){
        int start =0,end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end= mid;
            else
                start = mid+1;
        }
        return start;
    }
    static int search(int arr[],int start, int end,int key){
        int mid = start + (end-start)/2;
        if(start>end)
            return -1;
        if(arr[mid] == key)
            return mid;
        else if(key>arr[mid])
            return search(arr,mid+1,end,key);
        else
            return search(arr,start,mid-1,key);
    }
    public static void main(String args[]){

        System.out.println(search(new int[]{1,3,8,10,12},0,5,12));
        System.out.println(bitonicSearch(new int[]{1,3,8,4,3},4));
        System.out.println(bitonicSearch(new int[]{3,8,3,1},8));
        System.out.println(bitonicSearch(new int[]{1,3,8,12},12));
        System.out.println(bitonicSearch(new int[]{10,9,8},10));
    }
}
