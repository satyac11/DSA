package Patterns.PatternCyclicSort;

public class FindMissingNumber {

    static int findMissingNumber(int []nums){
        int i=0;
        while(i<nums.length){
            //int j = nums[i]
            if(nums[i]<nums.length && nums[i] != nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            else
                i++;
        }

        for(int k=0;k<nums.length;k++){
            if(k!=nums[k])
                return k;
        }
        return -1;
    }
    static void swap(int []array, int i, int j){
        int temp =array[i];
        array[i]=array[j];
        array[j]=temp;

    }

    public static void main(String[] args) {
        System.out.println("Missing Number: "+findMissingNumber(new int[]{4, 0, 3, 1}));
        System.out.println("Missing Number: "+findMissingNumber(new int[]{8, 3, 5, 2, 4, 6, 0, 1}));
    }
}
