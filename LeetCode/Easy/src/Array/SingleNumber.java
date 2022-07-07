package Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumberBF(int []nums){
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(i !=j && nums[i]==nums[j])
                    count++;
            }
            if(count==1)
                return nums[i];
        }
        return -1;
    }

    public static int singleNumber(int [] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entrySet: map.entrySet()){
            if(entrySet.getValue()==1)
                return entrySet.getKey();
        }
        return -1;

    }

    public static int singleNumberXOR(int []nums){
        int result = 0;
        for(int num:nums)
            result = result^num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumberBF(new int[]{2,2,1}));
        System.out.println(singleNumberBF(new int[]{4,1,2,1,2}));
        System.out.println(singleNumberBF(new int[]{1}));
        System.out.println("====================================");
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
        System.out.println("====================================");
        System.out.println(singleNumberXOR(new int[]{2,2,1}));
        System.out.println(singleNumberXOR(new int[]{4,1,2,1,2}));
        System.out.println(singleNumberXOR(new int[]{1}));
    }
}
