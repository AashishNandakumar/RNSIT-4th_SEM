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
        table = new int[noOfItems+1][knapsackCapacity+1];
    }

    void tabulaization(){

        for(int i=0;i<noOfItems;i++){
            for(int j=0;j<noOfItems;j++){
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
        for(int i=0;i<noOfItems;i++){
            for(int j=0;j<noOfItems;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter knapsack capacity: ");
        int m = in.nextInt();
        System.out.println("Enter no of items: ");
        int n = in.nextInt();

        int[] P = new int[n];
        int[] w = new int[n];

        System.out.println("Enter profit and weight for each item: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter profit "+(i+1));
            P[i] = in.nextInt();
            System.out.println("Enter weight "+(i+1));
            w[i] = in.nextInt();
        }

        Knapsack01DynamicProgramming obj = new Knapsack01DynamicProgramming(m, n, P, w);
        obj.tabulaization();
    }
}
