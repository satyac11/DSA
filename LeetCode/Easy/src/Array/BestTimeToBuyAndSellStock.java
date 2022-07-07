package Array;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int []prices){
        int max =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0)
                max +=prices[i]-prices[i-1];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }
}
