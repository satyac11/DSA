package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    private static void rotateArray(int []array, int n){
        int length = array.length;
        int []temp = new int[length];
        int j=n;
        for(int i=0;i<length;i++){
            if(j<length && (i+n)<length){
                temp[i] = array[j];
                j++;
            }
            else {
                if(i+n == length)
                    j=0;
                temp[i] = array[j];
                j++;
            }
        }
        String output = Arrays.toString(temp);
        output = output.replaceAll(",","");
        output = output.substring(1,output.length()-1);
        System.out.println(output);
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0;i<testCases;i++){
            int size = sc.nextInt();
            int noOfElementsToRotate = sc.nextInt();
            int []array = new int[size];
            for(int j=0;j<array.length;j++){
                array[j] = sc.nextInt();
            }
            rotateArray(array,noOfElementsToRotate);
        }
    }
}
