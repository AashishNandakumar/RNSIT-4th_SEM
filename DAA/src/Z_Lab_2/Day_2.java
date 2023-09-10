package Z_Lab_2;
import java.util.*;
class Sorting{

    void bubbleSort() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        int []A = new int[n];
        for(int k=0;k<n;k++) {
            A[k] =(int) (Math.random()*100);

        }
        System.out.println("Array elements: ");
        for(int k=0;k<n;k++) {
            System.out.print(" "+A[k]);
        }
        System.out.println();
        System.out.println("Sort it(1 - YES/other - NO: ");
        int ch = in.nextInt();
        if(ch==1) {
            Arrays.sort(A);
        }

        long start = System.nanoTime();
        for(int i=0;i<n-1;i++) {
            boolean flag = false;
            for(int j=0;j<n-i-1;j++) {
                if(A[j]>A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }

        }
        long stop = System.nanoTime();
        long time = stop - start;
        System.out.println("Time: "+time+" ns");

    }

    void selectionSort() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        int []A = new int[n];
        for(int k=0;k<n;k++) {
            A[k] =(int) (Math.random()*100);

        }
        System.out.println("Array elements: ");
        for(int k=0;k<n;k++) {
            System.out.print(" "+A[k]);
        }
        System.out.println();
        System.out.println("Sort it: ");
        int ch = in.nextInt();
        if(ch==1) {
            Arrays.sort(A);
        }

        int j, k;
        long start = System.nanoTime();

        for(int i=0;i<n-1;i++) {
            for(j=k=i;j<n;j++) {
                if(A[k]>A[j]) {
                    k = j;
                }
            }
            int temp = A[i];
            A[i] = A[k];
            A[k] = temp;
        }
        long stop = System.nanoTime();
        long time = stop - start;
        System.out.println("Time: "+time+" ns");
    }

    void stringMatching() {
        Scanner in = new Scanner(System.in);
        String mainStr = in.nextLine();
        String patStr = in.nextLine();
        int len = 0;
        boolean f = false;

//        Will be updated soon




    }
}

public class Day_2 {

    public static void main(String[] args) {
        Sorting obj = new Sorting();

        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("--MENU--");
            System.out.println("1. bubble sort");
            System.out.println("2. selection sort");
            System.out.println("3. pattern mtching");

            System.out.println("7. Exit");


            System.out.println("--> ");
            int op = in.nextInt();
            switch (op) {
                case 1 -> obj.bubbleSort();
                case 2 -> obj.selectionSort();
                case 3 -> obj.stringMatching();
                case 7 -> {
                    System.exit(0);

                }
            }
        }


    }

}

