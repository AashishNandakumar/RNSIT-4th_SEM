package Lab_5;
import java.util.*;
public class InsertionSort {

    void insertionSort(int n) {
        try{
            Random rm = new Random();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0;i<n;i++) {
                arr.add(i, rm.nextInt(0, 101));
            }

            for(int i=1;i<n;i++) {
                int temp = arr.get(i);
                int j = i-1;
                while(j>-1 && arr.get(j)>temp) {
                    arr.set(j+1, arr.get(j));
                    j--;
                }
                arr.set(j+1, temp);
            }

            System.out.println(arr);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
