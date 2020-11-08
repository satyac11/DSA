package Arrays.Problems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleElement(int []nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!= null)
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
                return entry.getKey();

        }
        return -1;
    }

    //Author Solution
    /*public int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }*/

    public static void main(String []args){
        int []nums = {1};
        System.out.println("Single Element: "+singleElement(nums));
    }
}
