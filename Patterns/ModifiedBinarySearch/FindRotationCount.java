package Patterns.ModifiedBinarySearch;

public class FindRotationCount {

    public static int findCount(int []array){
        int n= array.length,start =0,end = n-1;

        while(start<=end){
            if(array[start]<=array[end])
                return start;
            int mid = start + (end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;

            if(array[mid]<=array[prev] && array[mid]<=array[next])
                return mid;
            else if(array[mid]<=array[end])
                end = mid-1;
            else if(array[mid]>=array[start])
                start = mid+1;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findCount(new int[]{1,3,8,10,15}));
        System.out.println(findCount(new int[]{15,1,3,8,10}));
        System.out.println(findCount(new int[]{10,15,1,3,8}));
        System.out.println(findCount(new int[]{8,10,15,1,3}));

    }
}
