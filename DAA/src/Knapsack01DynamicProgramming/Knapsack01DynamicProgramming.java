package Knapsack01DynamicProgramming;

import java.util.Scanner;

public class Knapsack01DynamicProgramming {
    int[] Profit;
    int[] weight;
    int knapsackCapacity;
    int noOfItems;
    int[][] table;

    Knapsack01DynamicProgramming(int m, int n, int[] P, int[] w){
        knapsackCapacity = m;
        noOfItems = n;
        Profit = P;
        weight = w;
        table = new int[n+1][m+1];
    }

    void tabulaization(){
        for(int i=0;i<=noOfItems;i++){
            for(int j=0;j<=knapsackCapacity;j++){
                if(i==0 || j==0)
                    table[i][j] = 0;
                else if(weight[i] <= j){
                    table[i][j] = Math.max(table[i-1][j], (table[i-1][j-weight[i]] + Profit[i]));
                }
                else
                    table[i][j] = table[i-1][j];

            }
        }

        System.out.println("Table data: ");
        for(int i=0;i<=noOfItems;i++){
            for(int j=0;j<=knapsackCapacity;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        decision();
    }

    void decision(){
        int i = noOfItems, j = knapsackCapacity;
        while(i>0 && j>0){
            if(table[i][j] == table[i-1][j]){
                System.out.println(i+": 0");
                i--;
            }else{
                System.out.println(i+": 1");
                i--;
                j -= weight[i];
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter knapsack capacity: ");
        int m = in.nextInt();
        System.out.println("Enter no of items: ");
        int n = in.nextInt();

        int[] P = new int[n+1];
        int[] w = new int[n+1];

        System.out.println("Enter profit and weight for each item: ");
        for(int i=1;i<=n;i++){
            System.out.println("Enter profit "+(i));
            P[i] = in.nextInt();
            System.out.println("Enter weight "+(i));
            w[i] = in.nextInt();
        }

        Knapsack01DynamicProgramming obj = new Knapsack01DynamicProgramming(m, n, P, w);
        obj.tabulaization();
    }
}
