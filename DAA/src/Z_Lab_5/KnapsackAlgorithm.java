package Z_Lab_5;
import java.util.*;
public class KnapsackAlgorithm {

    ArrayList<Double> X = new ArrayList<>();
    ArrayList<Double> W = new ArrayList<>();
    ArrayList<Double> P = new ArrayList<>();
    int noOfItems;
    Double knapsackCapacity;

    void setItemPart() {

        int i;
        for(i =0;i<noOfItems;i++) {
            X.add(0.0);
        }

        Double temp = knapsackCapacity;

        first:
        for(i=0;i<noOfItems;i++) {
            if(W.get(i)>temp)
                break first;

            X.set(i, 1.0);
            temp -= W.get(i);
        }

        if(i<=noOfItems)
            X.set(i, (temp/W.get(i)));
    }

    void setItemWeight() {
        int i;
        double x;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        for(i =0;i<noOfItems;i++) {
            System.out.println("Enter weight for Item "+i +": ");
            x = in.nextDouble();
            W.add(x);
        }
    }

    void setItemProfit() {
        int i;
        double x;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        for(i =0;i<noOfItems;i++) {
            System.out.println("profit for Item "+i +": ");
            x = in.nextDouble();
            P.add(x);
        }
    }

    int getterWX() {
        int temp1 = 0;
        for(int i=0;i<noOfItems;i++) {
            temp1 += W.get(i)*X.get(i);
        }
        return temp1;
    }

    int getterPX() {
        int temp2 = 0;
        for(int i=0;i<noOfItems;i++) {
            temp2 += P.get(i)*X.get(i);
        }

        return temp2;
    }


    public void knapsackAlgo(double k, int n) {
        knapsackCapacity = k;
        noOfItems = n;

        setItemWeight();
        setItemProfit();
        setItemPart();

        System.out.println("\nResult: ");
        System.out.println("Sum(WiXi): "+getterWX());
        System.out.println("Sum(PiXi): "+getterPX());
        System.out.println("Solution Vector: { "+X+" }");
    }
}
