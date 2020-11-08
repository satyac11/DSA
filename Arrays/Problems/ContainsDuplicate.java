package Arrays.Problems;

import java.util.*;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    static boolean containsDuplicates(int []nums){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(map.get(nums[i])!=null && map.get(nums[i])>0)
                return true;
            else
                map.put(nums[i],1);
        }
        return false;

    }

    public static void main(String args[]){
        int []nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println("Contains Duplicates: "+containsDuplicates(nums));
    }
}
