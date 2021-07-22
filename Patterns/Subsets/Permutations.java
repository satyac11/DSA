package Patterns.Subsets;

import java.util.*;

public class Permutations {

    static List<List<Integer>> findPermutations(int[]nums){
        List<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        for(int num:nums){
            int n = permutations.size();
            for(int i=0;i<n;i++){
                List<Integer> oldPerm = permutations.get(0);
                int permSize = oldPerm.size();
                for(int j=0;j<=permSize;j++){
                    List<Integer> permutation = new LinkedList<>(oldPerm);
                    permutation.add(j,num);
                    permutations.add(permutation);
                }
                permutations.remove(0);
            }

        }
        return permutations;
    }

    static List<List<Integer>> findPermutations2(int []nums){
        Queue<List<Integer>> permutations = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        permutations.add(new ArrayList<>());
        for(int num:nums){
            int n = permutations.size();
            for(int i=0;i<n;i++){
                List<Integer> oldPerm = permutations.poll();
                for(int j=0;j<=oldPerm.size();j++){
                    List<Integer> newPerm = new ArrayList<>(oldPerm);
                    newPerm.add(j,num);
                    if(newPerm.size()==nums.length)
                        result.add(newPerm);
                    else
                        permutations.add(newPerm);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*System.out.println(findPermutations(new int[]{1,3,5}));
        System.out.println(findPermutations(new int[]{1,2,3}));*/
        System.out.println(findPermutations2(new int[]{1,3,5}));
        System.out.println(findPermutations2(new int[]{1,2,3}));

    }
}
