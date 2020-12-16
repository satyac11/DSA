package Design;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {

    static int []nums;
    static int []original;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        deepCopy(nums.length);
    }

    public void deepCopy(int n){
        original = new int[n];
        for(int i=0;i<n;i++)
            original[i] = nums[i];
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = original;
        original = original.clone();
        return nums;

    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        int index1 = random.nextInt(nums.length-1);
        int index2 = random.nextInt(nums.length-1);
        System.out.println("index 1: "+index1);
        System.out.println("index 2: "+index2);

        index2 =(index1==index2)?random.nextInt(nums.length-1):index2;

        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = nums[temp];

        return nums;
    }

    public static void main(String[] args) {
        ShuffleAnArray obj = new ShuffleAnArray(new int[]{1, 2, 3});
        obj.shuffle();
        System.out.println("Shuffle: "+ Arrays.toString(obj.nums));
        obj.reset();
        System.out.println("Reset: "+ Arrays.toString(obj.nums));
        obj.shuffle();
        System.out.println("Shuffle: "+ Arrays.toString(obj.nums));
    }
}
