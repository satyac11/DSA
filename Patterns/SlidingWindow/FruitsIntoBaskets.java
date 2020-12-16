package Patterns.SlidingWindow;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static int findLength(char []trees){
        int start=0,maxLength=0;
        Map<Character,Integer> basket = new HashMap<>();

        for(int end=0;end<trees.length;end++){
            basket.put(trees[end],basket.getOrDefault(trees[end],0)+1);

            while(basket.size()>2){
                /*int length = end-start;
                if(maxLength<length)
                    maxLength = length;*/

                Character startingTree = trees[start];
                if(basket.get(startingTree)==1)
                    basket.remove(startingTree);
                else
                    basket.put(startingTree,basket.get(startingTree)-1);
                start++;
            }
//            maxLength = Math.max(maxLength,end-start+1);
            int length = end-start+1;
            if(maxLength<length)
                maxLength= length;


        }
       /* for(Map.Entry<Character, Integer> entity: basket.entrySet()){
            maxLength = maxLength+entity.getValue();
        }*/
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: "+ findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        System.out.println("Maximum number of fruits: "+ findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}
