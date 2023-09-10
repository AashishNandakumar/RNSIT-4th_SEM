package G_PrimsAlgorithm;

import java.util.*;

public class PrimsMinimumCostSpanningTree {
    int []near;
    int [][]spanningTree;
    int [][]costAdjacencyMatrix;
    int I = Integer.MAX_VALUE;
    int noOfVertices;
    Scanner in;
    PrimsMinimumCostSpanningTree(){
//        in = new Scanner(System.in);
//        System.out.println("Enter number of vertices: ");
//        this.noOfVertices = in.nextInt();
        this.noOfVertices = 7;

//        this.costAdjacencyMatrix = new int[this.noOfVertices][this.noOfVertices];
        this.costAdjacencyMatrix = new int[][]{ {I, I, I, I, I, I, I, I},
                                                {I, I, 25, I, I, I, 5, I},
                                                {I, 25, I, 12, I, I, I, 10},
                                                {I, I, 12, I, 8, I, I, I},
                                                {I, I, I, 8, I, 16, I, 14},
                                                {I, I, I, I, 16, I, 20, 18},
                                                {I, 5, I, I, I, 20, I, I},
                                                {I, I, 10, I, 14, 18, I, I},};
//        this.near = new int[this.noOfVertices];
        this.near = new int[8];
//        this.spanningTree = new int[2][this.noOfVertices-1];
        this.spanningTree = new int[2][7];


//        fill up the cost adjacency matrix
//        System.out.println("Enter the cost between the vertices: ");
//        for(int i=0;i<this.noOfVertices;i++){
//            for(int j=0;j<this.noOfVertices;j++){
//                if(i == 0 || j == 0)
//                    this.costAdjacencyMatrix[i][j] = this.I;
//                else {
//                    System.out.println("Enter cost for vertices " + i + " and " + j + ": ");
//                    System.out.println("No connection(1/0): ");
//                    int op = in.nextInt();
//                    if (op == 1)
//                        this.costAdjacencyMatrix[i][j] = this.I;
//                    else {
//                        System.out.println("Enter cost: ");
//                        this.costAdjacencyMatrix[i][j] = in.nextInt();
//                    }
//                }
//            }
//        }

//        Initialize the near array to infinity
        for(int i=0;i<=this.noOfVertices;i++){
            this.near[i] = this.I;
        }

//        pick up the min element from the cost adjacency matrix
        int min = this.I;
        int u = 0, v = 0;
        for(int i = 1;i <= this.noOfVertices;i++){
            for(int j = i;j <= this.noOfVertices;j++){
                if(min>this.costAdjacencyMatrix[i][j]){
                   min = this.costAdjacencyMatrix[i][j];
//                   Also keep the track of the indices of the min element
                   u = i;
                   v = j;
                }
            }
        }

//
        this.spanningTree[0][0] = u;
        this.spanningTree[1][0] = v;
        this.near[u] = 0;
        this.near[v] = 0;
//
        for(int i=1;i<=this.noOfVertices;i++){
            if(this.near[i]!=0 && this.costAdjacencyMatrix[i][u] < this.costAdjacencyMatrix[i][v])
                this.near[i] = u;
            else
                this.near[i] = v;
        }
//        End of Initial code
//        Repeating stuff begins
        int k = 0;
        for(int i=1;i<=this.noOfVertices-1;i++){
            min = this.I;
            for(int j=1;j<=this.noOfVertices;j++){
                if(near[j]!=0 && this.costAdjacencyMatrix[j][this.near[j]] < min){
                    min = this.costAdjacencyMatrix[j][this.near[j]];
                    k = j;
                }
            }

            this.spanningTree[0][i] = k;
            this.spanningTree[1][i] = this.near[k];
            this.near[k] = 0;

            for(int j=1;j<=this.noOfVertices;j++){
                if(near[j]!=0 && this.costAdjacencyMatrix[j][k] < this.costAdjacencyMatrix[j][this.near[j]])
                    this.near[j] = k;
            }
        }
//        System.out.println(this.spanningTree.toString());
        for (int i = 0; i < this.noOfVertices - 1; i++) {
            System.out.println("Edge: " + this.spanningTree[0][i] + " - " + this.spanningTree[1][i]);
        }
    }

    public static void main(String[] args) {
        new PrimsMinimumCostSpanningTree();
    }


}
