package DynamicProgramming;

public class Factorial {

    private static int bottomUpFact(int n){
        int []fact = new int [n];
        fact[0] =1;
        fact[1] = 2;
        for(int i=2;i<n;i++){
            fact[i] = (i+1)*fact[i-1];
        }
        return fact[n-1];

    }
    static int []fact = new int[5];
    private static int topDownFact(int n){
        if(n==0 || n==1)
            return 1;
        if(fact[n]!=0)
            return fact[n];
        return fact[n]=n*topDownFact(n-1);
    }


    public static void main(String []args){
        int n =5;
        fact = new int[n+1];
        System.out.printf("Factorial of %d is: %d",n,bottomUpFact(n));
        System.out.println();
        System.out.println(topDownFact(n));

    }
}
