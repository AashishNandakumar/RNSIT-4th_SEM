package Z_Lab_1;
import java.util.*;

class simplePrograms{

    void maxNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        System.out.println("Enter Array elements: ");
        int []A = new int[n];
        for(int k=0;k<n;k++) {
            A[k] = in.nextInt();
        }
        int max = A[0];
        for(int i=0;i<n;i++) {
            if(max<A[i])
                max = A[i];
        }
        System.out.println(max);
    }

    void printNElements() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = in.nextInt();
        for(int i=1;i<n+1;i++) {
            System.out.println(i);
        }
    }

    void uniqueElements() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        System.out.println("Enter Array elements: ");
        int []A = new int[n];
        for(int k=0;k<n;k++) {
            A[k] = in.nextInt();
        }
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(A[i]==A[j]) {
                    System.out.println("NOT UNIQUE");
                    return;
                }
            }
        }
        System.out.println("UNIQUE");

    }

    void simpleCalculator() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("--MENU--");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXIT");

            System.out.println("--> ");
            int op = in.nextInt();
            System.out.println("Enter numbers A and B: ");
            int A = in.nextInt();
            int B = in.nextInt();
            switch(op) {
                case 1: System.out.println(A+B);
                    break;
                case 2: System.out.println(A-B);
                    break;
                case 3: System.out.println(A*B);System.out.println("4. DIVISION");
                case 4: try {
                    System.out.println(A/B);
                    break;
                }catch(Exception e) {
                    e.printStackTrace();
                }
                case 5: return;
            }

        }

    }

    void matrixMultiplication() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows and columns of matrix-1: ");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println("Enter matrix-1 elements: ");
        int [][]A = new int[m][n];
        for(int a=0;a<m;a++) {
            for(int b=0;b<n;b++) {
                A[a][b] = in.nextInt();

            }
        }

        System.out.println("Enter no of rows and columns of matrix-2: ");
        int p = in.nextInt();
        int q = in.nextInt();
        System.out.println("Enter matrix-2 elements: ");
        int [][]B = new int[p][q];
        for(int c=0;c<p;c++) {
            for(int d=0;d<q;d++) {
                B[c][d] = in.nextInt();

            }
        }

        if(n==p) {
            int [][]c = new int[m][q];
            for(int i=0;i<m;i++) {
                for(int j=0;j<q;j++) {
                    c[i][j]=0;
                    for(int k=0;k<m;k++) {
                        c[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("Result");
            for(int i=0;i<m;i++) {
                for(int j=0;j<q;j++) {
                    System.out.print(" "+c[i][j]);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Multiplication not possible");
        }
    }

    void linearSearch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        int []A = new int[n];
        for(int k=0;k<n;k++) {
//            Generate random numbers of range 0 to 100
            A[k] =(int) (Math.random()*100);
        }
        System.out.println("Array elements: ");
        for(int k=0;k<n;k++) {
            System.out.print(" "+A[k]);
        }
        boolean flag = false;
        System.out.println();
        int key = 0;

        while(true) {
            System.out.println("\nChoose a complexity: ");
            System.out.println("1. Best case\n2. Average case\n3. Worst case\n");
            System.out.print("--> ");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> key = A[0];
                case 2 -> key = A[n / 2];
                case 3 -> key = A[n - 1];
                case 4 -> {
                    return;
                }
            }
            long startTime = System.nanoTime();
            for(int i=0;i<n;i++) {
                if(key==A[i]) {
                    flag = true;
                    break;

                }
            }
            long stopTime = System.nanoTime();
            System.out.println("Key found: "+flag);
            long time = stopTime-startTime;
            System.out.println("Time: "+ time+" ns\n");

        }
    }
}


public class Day_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        simplePrograms obj = new simplePrograms();
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("\n--MENU--");
            System.out.println("1. Max element of a list");
            System.out.println("2. 1st n natural numbers");
            System.out.println("3. Distinct elements");
            System.out.println("4. Simple calculator");
            System.out.println("5. Matrix multiplication");
            System.out.println("6. Linear search");
            System.out.println("7. Exit");


            System.out.print("--> ");
            int op = in.nextInt();
            switch (op) {
                case 1 -> obj.maxNumber();
                case 2 -> obj.printNElements();
                case 3 -> obj.uniqueElements();
                case 4 -> obj.simpleCalculator();
                case 5 -> obj.matrixMultiplication();
                case 6 -> obj.linearSearch();
                case 7 -> System.exit(0);
            }
        }

    }

}