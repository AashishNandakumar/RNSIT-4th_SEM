package HamiltonianCycles;
import java.util.*;
public class Hamiltonian {
    static int n = 5;
//    static int[][] costAdjMatrix = new int[][]{ {0, 1, 1, 1, 99},
//                                                {1, 0, 99, 1, 99},
//                                                {1, 99, 0, 1, 1},
//                                                {1, 1, 1, 0, 1},
//                                                {99, 99, 1, 1, 0},
//                                                };

    static int[][] costAdjMatrix = new int[n+1][n+1];
    static int[] x = new int[n+1];
    static boolean flag = false;

    static void NextVertex(int vertex){
        do{
            x[vertex] = (x[vertex] + 1) % (n+1);
            if(x[vertex] == 0)
                return;
            if(costAdjMatrix[x[vertex-1]][x[vertex]] == 1){
                int j = 0;
                for(j=1;j<=vertex-1;j++){
                    if(x[j] == x[vertex])
                        break;
                }
                if(j == vertex){
                    if((vertex<n) || (vertex==n) && costAdjMatrix[x[n]][1] == 1)
                        return;
                }
            }
        }while(true);
    }

    static void HamiltonianCycle(int vertex){
        do{
            NextVertex(vertex);
            if(x[vertex] == 0)
                return;
            if(vertex == n){
                flag = true;
                System.out.println("Hamiltonian cycle: ");
                for(int i=1;i<=n;i++)
                    System.out.print(x[i]+" ");
                System.out.println();
            }else{
                HamiltonianCycle(vertex+1);
            }


        }while (true);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n = scan.nextInt();
        System.out.println("Enter the adjacency matrix");
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
                costAdjMatrix[i][j] = scan.nextInt();


        x[1] = 1;
        HamiltonianCycle(2);
        if(!flag){
            System.out.print("No hamiltonian cycles for the given data");
            System.exit(-1);
        }
    }
}
