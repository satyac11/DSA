package Arrays;

import java.util.Arrays;

public class ArrayADT {

    //add
    //append
    //replace
    //remove
    //search
    //display
    //size
    //Max and Min in single scan
    //reverse
    //isSorted
    //merging
    //Union,intersection & Difference
    //Single missing element
    //Multiple missing elements
    //Finding Duplicates in sorted and un sorted Array
    //Finding Pair of elements with sum k

    public static int [] add(int []array,int element,int index){
        int newArray[] = new int[array.length+1];

        int j=0;
        for(int i=0;i<newArray.length;i++){
            if(i == index)
                newArray[i]= element;
            else {
                newArray[i] = array[j];
                j++;
            }
        }

        return newArray;
    }

    public static int[] append(int array[],int element){
        int newArray[] = new int[array.length+1];
        for(int i=0;i<newArray.length;i++){
            if(i==newArray.length-1)
                newArray[i] = element;
            else
                newArray[i] = array[i];
        }
        return newArray;
    }

    public static int [] delete(int array[],int element){
        int j=0;
        for(int i=0;i<array.length;i++){
            j=i;
            if(array[i]==element){
                while(j<array.length-1){
                    array[j]=array[j+1];
                    j++;
                }
                array[j]=0;
            }
        }

        return array;

    }

    //replace
    public static int[] set(int[] array, int element,int index){
        if(index>=0 && index<array.length )
            array[index] = element;
        return array;
    }

    //Binary Search
    public static int indexOf(int array[],int element){
        int r= array.length,l=0;
        while(l<r){
            int mid = (l+r)/2;
            if(element == array[mid])
                return mid;
            else if(element>array[mid]){
                l=mid+1;
            }
            else
                r=mid;
        }
        return -1;
    }

    //Max and Min values
    public static void findMaxAndMinValues(int array[]){
        int max=array[0],min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min)
                min = array[i];
            if(array[i]>max)
                max = array[i];
        }
        System.out.println("Max Value is: "+max);
        System.out.println("Min Value is: "+min);
    }

    public static int[] reverse(int array[]){
        int i=0,j=array.length-1;
        while(i<j){
            swap(array,i,j);
            i++;
            j--;
        }
        return array;
    }

    public static void swap(int []array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isSorted(int []array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
                return false;
        }
        return true;
    }

    public static void multipleMissingElements(int array[]){
        int diff = array[0];
        System.out.print("Missing Elemets are: ");
        for(int i=1;i<array.length;i++){
            int newDiff = array[i]-i;
             if(diff !=newDiff){
                 /*System.out.print("Missing Elemets are: ");
                 for(int j=1;j<=newDiff-diff;j++){
                    System.out.printf("%d ",(i+j));
                 }
                 diff = newDiff;*/

                 while(diff<newDiff){
                     System.out.printf("%d ",i+diff);
                     diff++;
                 }
             }
        }
    }

    public static void main(String args[]){

       /* int []array = {1,2,4,5};
        int newArray[]=add(array,7,2);
        System.out.println("Add: "+Arrays.toString(newArray));
        System.out.println("Append: "+Arrays.toString(append(newArray,6)));
        System.out.println("Replace an element: "+Arrays.toString(set(newArray,3,2)));
       // System.out.println("Delete an element: "+Arrays.toString(delete(newArray,3)));
        System.out.println("Binary Search: "+indexOf(newArray,3));
        findMaxAndMinValues(newArray);*/
        //System.out.println("Reverse: "+Arrays.toString(reverse(newArray)));
        //System.out.println("Sorted: "+isSorted(newArray));
        multipleMissingElements(new int[]{1,2,3,6,7,8,10});
    }


}
