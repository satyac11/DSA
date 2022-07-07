package Array;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int []nums){
        if(nums.length==0)
            return 0;
        int i=0,j=0;
        while(j<nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
                j++;

            }
            else{
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{1,1,2,2,3}));
    }
}
