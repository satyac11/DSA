package Patterns.ModifiedBinarySearch;

public class BitonicArrayMaximum {

    static int finMax(int arr[]){
        int start =0,end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }
            else
                start = mid+1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        System.out.println(finMax(new int[]{1,3,8,12,4,2}));
        System.out.println(finMax(new int[]{3,8,3,1}));
        System.out.println(finMax(new int[]{1,3,8,12}));
        System.out.println(finMax(new int[]{10,9,8}));

    }
}
