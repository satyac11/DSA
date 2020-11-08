package Arrays.Problems;

import java.util.*;


/*Given two arrays, write a function to compute their intersection.

        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Note:

        Each element in the result should appear as many times as it shows in both arrays.
        The result can be in any order.
        Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?*/

public class IntersectionofTwoArrays {

    public static int[] interSection(int[] nums1, int[] nums2) {
        List<Integer> myList = new ArrayList(); // result list for common values

        Map<Integer, Integer> myMap = new HashMap();

        for (int i : nums1) { // map for nums1 items, how many times appear
            if (myMap.containsKey(i))
                myMap.put(i, myMap.get(i) + 1);
            else
                myMap.put(i, 1);
        }

        for (int i : nums2) { // this time look for num2 items
            if (myMap.containsKey(i) && myMap.get(i) > 1) { // if it is more than 1
                myMap.put(i, myMap.get(i) - 1); // decrease frequency of it
                myList.add(i); // add common element to result list
            } else if (myMap.containsKey(i) && myMap.get(i) == 1) {
                myMap.remove(i); // I will not need as a common, once more as it appears only once
                myList.add(i); // add common element to result list
            }
        }

        // convert List to array as it is expected as int array
        int[] r = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            r[i] = myList.get(i);
        }
        return r;

    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println("Intersection: " + Arrays.toString(interSection(nums1, nums2)));
    }
}
