package GreedyKnapsackAlgorithm;

import java.util.*;

public class Knapsack {
    Scanner in;
    Knapsack(){
        int noOfObjects;
        int knapsackCapacity;
        ArrayList<Integer> profit = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<Double> partsOfObject = new ArrayList<>();

        in = new Scanner(System.in);
        System.out.println("Enter knapsack capacity: ");
        knapsackCapacity = in.nextInt();
        System.out.println("Enter no of objects: ");
        noOfObjects = in.nextInt();

        for(int i=0;i<noOfObjects;i++){
            System.out.println("For object "+(i+1)+" enter the following details: ");
            System.out.println("Enter weight: ");
            int w = in.nextInt();
            System.out.println("Enter profit: ");
            int p = in.nextInt();
            weight.add(w);
            profit.add(p);

        }
        in.close();

//        ArrayList<Integer> tempIndex = new ArrayList<>();
        for(int i=0;i<noOfObjects-1;i++){
            for(int j=0;j<noOfObjects-i-1;j++){

                if(profit.get(j)/weight.get(j) < profit.get(j+1)/weight.get(j+1)){
//                    tempIndex.add(j);

                    Collections.swap(profit, j, j+1);
                    Collections.swap(weight, j, j+1);
                }

            }
        }

        for(int i=0;i<noOfObjects;i++){
            if(weight.get(i)<=knapsackCapacity){
                partsOfObject.add(1d);
                knapsackCapacity -= weight.get(i);
            }
            else{
                partsOfObject.add((double)knapsackCapacity/(double)weight.get(i));
                knapsackCapacity = 0;
            }
        }

        double sumXP = 0, sumXW = 0;
        for(int i=0;i<noOfObjects;i++){
            sumXP += partsOfObject.get(i) * profit.get(i);
            sumXW += partsOfObject.get(i) * weight.get(i);
        }

        System.out.println("\nResult: ");
        System.out.println("Profit: "+profit);
        System.out.println("Weight: "+weight);
        System.out.println("Summation XW: "+sumXW);
        System.out.println("Summation XP: "+sumXP);
        System.out.println("Solution vector: ");

//        for(int i=0;i<noOfObjects;i++){
//            System.out.println("X"+(tempIndex.get(i))+": "+partsOfObject.get(i));
//        }
    }


    public static void main(String[] args) {
        new Knapsack();

    }
}
