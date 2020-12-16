package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    public int countPrimes(int n) {
        List<Integer> primeNumbers = new ArrayList<>();

        for(int i=1;i<=n;i++){
           if(isPrime(i))
               primeNumbers.add(i);
        }
        System.out.println(primeNumbers);
    return primeNumbers.size();
    }
    public boolean isPrime(int value){
        if(value ==1)
            return false;
        for(int i=2;i<=Math.sqrt(value);i++){
            if(value%i==0)
                return false;
        }
        return true;

    }
//Sieve of Eratosthenes O(nloglogn)
    public int countPrimes1(int n) {
        boolean []array = new boolean[n];
        if(n==0 || n==1)
            return 0;
        array[0]=false;
        array[1]=false;
        for(int i=2;i<n;i++){
            array[i]=true;
        }

        for(int i=2;i*i<n;i++){
            if(!array[i])
                continue;
            for(int j=2;j*i<n;j++){
                array[j*i]=false;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(array[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("No of prime numbers: "+new PrimeNumbers().countPrimes(20));
    }
}
