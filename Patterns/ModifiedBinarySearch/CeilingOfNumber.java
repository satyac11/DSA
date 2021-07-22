package Patterns.ModifiedBinarySearch;

public class CeilingOfNumber {
    public static int searchCeilingOfNumber(int array[],int key){
        int start =0,end = array.length-1;
        int mid=0;
        if(key>array[array.length-1])
            return -1;
        while(start<=end){
             mid = start +(end-start)/2;
            if(key == array[mid])
                return mid;
            if(key<array[mid])
                end = mid-1;
            else
                start = mid+1;
        }
            return start;
    }

    public static int searchFloorOfNumber(int []arr,int key){
        int start=0,end=arr.length-1;
        if(key<arr[0])
            return -1;
        while(start<=end){
           int mid = start +(end-start)/2;
            if(key == arr[mid])
                return mid;
            if(key<arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return end;

    }
    public static void main(String[] args) {
        System.out.println(searchCeilingOfNumber(new int []{4,6,10},6));
        System.out.println(searchCeilingOfNumber(new int []{1,3,8,10,15},12));
        System.out.println(searchCeilingOfNumber(new int []{1,3,8,10,15},17));
        System.out.println(searchCeilingOfNumber(new int []{4,6,10},17));
        System.out.println(searchCeilingOfNumber(new int []{4,6,10},-1));

        System.out.println(searchFloorOfNumber(new int []{4,6,10},6));
        System.out.println(searchFloorOfNumber(new int []{1,3,8,10,15},12));
        System.out.println(searchFloorOfNumber(new int []{1,3,8,10,15},17));
        System.out.println(searchFloorOfNumber(new int []{4,6,10},17));
        System.out.println(searchFloorOfNumber(new int []{4,6,10},-1));
    }
}
