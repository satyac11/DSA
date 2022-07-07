package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int []nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.get(diff)!=null)
                return new int[]{map.get(diff),i};
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,5},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3},6)));

    }
}
