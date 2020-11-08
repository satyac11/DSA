package Arrays.Problems;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[pointer++]=nums[i];
        }

        for(int j=pointer;j<nums.length;j++)
            nums[j] =0;
    }

    public static void main(String []args){
        int []nums = {0,1,0,3,12};
        moveZeroes(nums);

    }
}
