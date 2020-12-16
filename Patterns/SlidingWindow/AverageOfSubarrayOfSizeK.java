package Patterns.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AverageOfSubarrayOfSizeK {

    public static List<Double> averageOfSubArray(int []array, int k){
        List<Double> averages = new ArrayList<>();
        if(array.length<k)
            return averages;
        int start =0;
        double sum =0;
        for(int end=0;end<array.length;end++){
            sum +=array[end];
            if(end>=k-1){
                averages.add(sum/k);
                sum = sum - array[start];
                start++;
            }
        }

        return averages;

    }

    public static void main(String[] args) {
        System.out.println("Averages: "+averageOfSubArray(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2},5));
    }
}
