package DynamicProgramming.EasyProblems;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n==0)
            return 0;
        int []memory = new int[n+1];
        memory[0] =1;
        memory[1] =1;
        for(int i=2;i<=n;i++){
                memory[i] = memory[i-1]+memory[i-2];

        }
        return memory[n];

    }

    public static int climbStaisWithOutUsingArray(int n){

        int prev1 = 1;
        int prev2 = 1;
        int result =1;
        for(int i=2;i<=n;i++){
            result = prev1+prev2;
            prev1= prev2;
            prev2 = result;

        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println("No of possible ways: "+climbStairs(5));
    }
}
