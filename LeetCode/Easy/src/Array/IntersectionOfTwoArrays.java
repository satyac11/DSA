package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public static int[] intersectBF(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int value:nums1)
            list.add(value);
        List<Integer> intersect = new ArrayList<>();

        for (Integer num : nums2) {
            if (list.contains(num)) {
                list.remove(num);
                intersect.add(num);
            }

        }

        int[] nums = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            nums[i] = intersect.get(i);
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersectBF(new int[]{1,2,2,1},new int[]{2,2})));
        System.out.println(Arrays.toString(intersectBF(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
}
