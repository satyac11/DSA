package Patterns.ModifiedBinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOfNumber {

    public static int[] findRange(int arr[], int key) {
        int firstOccurence = search(arr, key, true);
        int lastOccurence = search(arr, key, false);
        return new int[]{firstOccurence, lastOccurence};
    }

    public static int search(int arr[], int key, boolean isFirstIndex) {
        int index = -1, start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                index = mid;
                if (isFirstIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }

    public static int findCount(int []array,int key){
        int []result = findRange(array,key);
        return result[1]-result[0]+1;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findRange(new int[]{4,6,6,6,9},6)));
        System.out.println(Arrays.toString(findRange(new int[]{1,3,8,10,15},10)));
        System.out.println(Arrays.toString(findRange(new int[]{1,3,8,10,15},12)));

        System.out.println("Count of 6 is: "+findCount(new int[]{4,6,6,6,9},6));



    }

}
