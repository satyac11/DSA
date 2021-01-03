package Patterns.TwoPointers;

import java.util.Arrays;

public class SquaringaSortedArray {

    public static int[]makeSquares(int []array){
        int start=0,end=array.length-1;

        int startSquare = array[start]*array[start];
        array[start]= startSquare;
        while(start<end){
            int endSquare = array[end]*array[end];
            array[end] = endSquare;

            if(startSquare>endSquare){
                array[start] = endSquare;
                array[end] = startSquare;
                startSquare = array[start];
            }

            end--;

        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Squares: "+ Arrays.toString(makeSquares(new int[]{-2, -1, 0, 2, 3})));
        System.out.println("Squares: "+Arrays.toString(makeSquares(new int[]{-3, -1, 0, 1, 2})));

    }
}
