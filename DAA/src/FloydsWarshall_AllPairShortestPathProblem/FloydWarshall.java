package FloydsWarshall_AllPairShortestPathProblem;

import java.awt.*;
import java.util.Scanner;

public class FloydWarshall {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of nodes: ");
        int n = in.nextInt();

        int[][] costAdjacencyMatrix = new int[n][n];

        System.out.println("Enter the cost adjacency matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("for nodes: "+(i+1)+" to "+(j+1));
                costAdjacencyMatrix[i][j] = in.nextInt();
            }
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    costAdjacencyMatrix[i][j] = Math.min(costAdjacencyMatrix[i][j], costAdjacencyMatrix[i][k]+costAdjacencyMatrix[k][j]);
                }
            }
        }

        System.out.println("All pair shortest path matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(costAdjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
