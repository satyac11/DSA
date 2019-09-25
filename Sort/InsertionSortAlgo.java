package Sort;
import java.util.Arrays;

public class InsertionSortAlgo {

    public static void sortValues(int []elements){
        for(int i=1;i<elements.length;i++){

            int j=i;
            //Identifying right position and inserting the element
            while(j>0 && elements[j-1]>elements[j]){
                int temp = elements[j];
                elements[j]=elements[j-1];
                elements[j-1]=temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(elements));
    }


    public static void main(String []args){

        int [] elements = {23,12,13,11,10,4,3,2,1,34,31};
        sortValues(elements);
    }
}
