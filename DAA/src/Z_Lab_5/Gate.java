package Z_Lab_5;
import java.util.*;
public class Gate {

    void call() {

        int op, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Choose an option:\n1. TOH\n2. Insertion sort\n3. Knapsack algorithm\n4. Exit");
        op = in.nextInt();
        switch(op) {
            case 1:
                System.out.println("Enter a no: ");
                n = in.nextInt();
                TOH obj1 = new TOH();
                obj1.Toh(n, 'A', 'B', 'C');
                break;
            case 2:
                System.out.println("Enter a no: ");
                n = in.nextInt();
                InsertionSort obj2 = new InsertionSort();
                obj2.insertionSort(n);
                break;
            case 3:
                System.out.println("Enter knapsack capacity and no of items: ");
                double k = in.nextDouble();
                n = in.nextInt();
                KnapsackAlgorithm obj3 = new KnapsackAlgorithm();
                obj3.knapsackAlgo(k, n);
            case 4:
                System.exit(0);
        }

    }
}
