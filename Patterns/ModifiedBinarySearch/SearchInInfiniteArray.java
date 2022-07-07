package Patterns.ModifiedBinarySearch;

import java.util.Arrays;

public class SearchInInfiniteArray {
    static class ArrayReader{
        int []arr;
        ArrayReader(int []arr){
            this.arr =arr;
        }

        int get(int index){
            if(index>=arr.length)
                return Integer.MAX_VALUE;
            else
                return arr[index];
        }
    }

    static int search(ArrayReader reader,int key){
        int start =0,end=1;
        while(reader.get(end)<key){
            int newStart = end+1;
            end +=(end-start+1)*2;
            start = newStart;
        }

        return binarySearch(reader,start,end,key);
    }
    static int binarySearch(ArrayReader reader,int start, int end,int key){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(reader.get(mid)==key)
                return mid;
            else if(reader.get(mid)<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayReader reader = new ArrayReader(new int[]{4,6,8,10,12,14,16,18,20,22,26,28,30});
        System.out.println(search(reader,30));
    }
}
