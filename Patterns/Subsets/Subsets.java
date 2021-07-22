package Patterns.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    static List<List<Integer>> findSubsets(int []nums){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int num: nums){
            int n = subsets.size();
            for(int i=0;i<n;i++){
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(num);
                subsets.add(subset);
            }
        }
        return subsets;
    }

    static List<List<Integer>> findSubsetsWithOutDuplicates(int []nums){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int num : nums){
            int n = subsets.size();
            for(int i=0;i<n;i++){
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(num);
                if(!subsets.contains(subset))
                    subsets.add(subset);
            }
        }
        return subsets;
    }

    static List<List<Integer>> findSubsetsWthOutDuplicates(int []nums){
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        int startIndex=0,endindex=0;

        for(int i=0;i<nums.length;i++){
            startIndex=0;
            if(i>0 && nums[i]==nums[i-1])
                startIndex = endindex+1;
            endindex = subsets.size()-1;
            for(int j=startIndex;j<=endindex;j++){
                List<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(nums[i]);
                subsets.add(subset);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        /*System.out.println(findSubsets(new int[]{1,5,3}));
        System.out.println(findSubsetsWithOutDuplicates(new int[]{1,3,3}));
        System.out.println(findSubsetsWithOutDuplicates(new int[]{1,5,3,3}));*/
        System.out.println(findSubsetsWthOutDuplicates(new int[]{1,5,3,3}));
    }
}
