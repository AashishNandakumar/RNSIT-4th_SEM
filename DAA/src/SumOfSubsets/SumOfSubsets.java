package SumOfSubsets;

import java.util.Scanner;

public class SumOfSubsets {
    int[] inputSet;
    int[] solution;
    int targetSum;
    int currentSum;
    int totalElements;

    SumOfSubsets(int[] inputSet, int targetSum){
        this.inputSet = inputSet;
        this.targetSum = targetSum;
        this.totalElements = inputSet.length;
        this.solution = new int[totalElements];
        this.currentSum = 0;
    }

    void solve(){
        backtrack(0);
    }

    void backtrack(int k){
        if(k==totalElements){
            if(currentSum == targetSum){
                System.out.print("Solution: ");
                for(int i=0;i<totalElements;i++){
                    if(solution[i] == 1)
                        System.out.print(inputSet[i]+" ");
                }
                System.out.println();
            }
            return;
        }

        solution[k] = 1;
        currentSum += inputSet[k];
        backtrack(k+1);

        solution[k] = 0;
        currentSum -= inputSet[k];
        backtrack(k+1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter no of elements: ");
        int n = in.nextInt();

        int[] inputSet = new int[n];
        int targetSum;

        System.out.println("Enter list of elements: ");
        for(int i=0;i<n;i++){
            inputSet[i] = in.nextInt();
        }

        System.out.println("Enter target sum: ");
        targetSum = in.nextInt();

        SumOfSubsets obj = new SumOfSubsets(inputSet, targetSum);
        obj.solve();
    }
}
