package Z_Lab_5;

public class TOH {

    void Toh(int n, char start, char auxillary, char end) {
        if(n==0) {
            return;
        }
        Toh(n-1, start, end, auxillary);
        System.out.println("Move disk "+n+" from "+ start  +" to "+end);
        Toh(n-1, auxillary, start, end);
    }
}
