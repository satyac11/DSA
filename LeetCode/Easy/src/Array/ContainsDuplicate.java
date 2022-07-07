package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicatesBruteForce(int []nums){
        if(nums.length<0)
            return false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicatesBestCase(int []nums){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            Integer value = map.get(nums[i]);
            if(value !=null && value>0)
                return true;
            else
                map.put(nums[i],1);

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicatesBruteForce(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicatesBestCase(new int[]{1,2,3,1}));

    }
}
