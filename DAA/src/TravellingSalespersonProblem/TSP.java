package TravellingSalespersonProblem;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class TSP {
    static int n ;
    static int[] x;
    static int[][] costAdjMatrix;
    static boolean flag = false;
    static int minDist = Integer.MAX_VALUE;
    static void setMinTourDistance(){
        int minTempSum = 0;
        for(int i=1;i<=n;i++){
            minTempSum += costAdjMatrix[x[i-1]][x[i]];
        }
        minTempSum += costAdjMatrix[x[n]][1];
        if(minTempSum < minDist )
            minDist = minTempSum;
    }

    static void nextCity(int city){
        do {
            x[city] = (x[city] + 1) % (n + 1);
            if (x[city] == 0)
                return;
            if (costAdjMatrix[x[city - 1]][x[city]] > 0) {
                int j = 0;
                for (j = 1; j <= city - 1; j++) {
                    if (x[j] == x[city])
                        break;
                }
                if (j == city) {
                    if ((city < n) || (city ==n) && costAdjMatrix[x[n]][1] > 0)
                        return;
                }
            }
        }while (true);

    }
    static void CitiesToBeTravelled(int city){
        do {
            nextCity(city);
            if (x[city] == 0)
                return;
            if (city == n) {
                flag = true;
                System.out.println("city tours: ");
                for (int i = 1; i <= n; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
//            here write the algo find the min tour of all possible tours.
                setMinTourDistance();
            } else {
                CitiesToBeTravelled(city + 1);
            }
        }while (true);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of cities: ");

        n = in.nextInt();
        x = new int[n + 1];
        costAdjMatrix = new int[n + 1][n + 1];

        System.out.println("Enter connection bw cities(0 - self loop & no connection, d(distance) - connection present");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("for cities "+i+ " to "+j+" : ");
                costAdjMatrix[i][j] = in.nextInt();
            }
        }

        x[1] = 1;

        CitiesToBeTravelled(2);
        if(!flag){
            System.out.println("Cant cover every cities");
            System.exit(-1);
        }

        System.out.println("The min tour distance is: "+minDist);
    }
}
