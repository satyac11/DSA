package SearchingAndSorting.Problems;

/*
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

        Output: [1,2,2,3,5,6]
*/

import java.util.Arrays;

public class MergeSortedArray {

    public static void mergeInPlace(int[] nums1, int m, int[] nums2, int n){
        int i = m-1,j=n-1,k=m+n-1;

        while(i>=0 &&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        // this while loop is for the condition when nums1 doesn't contain any element.
        while(j>=0){
            nums1[k--]= nums2[j--];
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []merge = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                k++;
                i++;
            }
            else{
                merge[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(j<n){
            merge[k] = nums2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(merge));

    }

    public static void main(String[] args) {

        mergeInPlace(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
