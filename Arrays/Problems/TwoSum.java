package Arrays.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining))
                return new int[]{map.get(remaining),i};
            else
                map.put(nums[i],i);
        }
        return new int[]{};

    }

    public static void main(String []args){
        int []nums = {2,7,11,15};
        System.out.println("Indices: "+ Arrays.toString(twoSum(nums,9)));

    }
}
