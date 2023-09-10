package F_KruskalsAlgorithm;

public class kruskalsMinimumCostSpanningTree {

    int edges[][];
    int included[];
    int set[];
    int t[][];
    int vertices;

    kruskalsMinimumCostSpanningTree(){
        edges = new int[][]{{1, 1, 2, 2, 3, 4, 4, 5, 5},
                            {2, 6, 3, 7, 4, 5, 7, 6, 7},
                            {25, 5, 12, 10, 8, 16, 14, 20, 18}};
        vertices = 7;
        included = new int[vertices+2];
        set = new int[vertices+1];
        t = new int[2][vertices-1];
        for(int i=0;i<vertices;i++){
            included[i] = 0;
            set[i] = -1;
        }
    }

    void union(int a, int b){
        if(set[a] < set[b]){
            set[a] += set[b];
            set[b] = a;
        }
        else{
            set[b] += set[a];
            set[a] = b;
        }
    }

    int find(int a){
        int x = a;
        while(set[x]>0){
            x = set[x];
        }

        return x;
    }
    void kruskals(){
        int i, k, u, v;
        i = k = u = v = 0;
        while(i < vertices - 1){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<vertices+2;j++){
                if(included[j] == 0  && edges[2][j] < min){
                    min = edges[2][j];
                    k = j;
                    u = edges[0][j];
                    v = edges[1][j];
                }
            }
            if(find(u) != find(v)){
                t[0][i] = u;
                t[1][i] = v;
                union(find(u), find(v));
                i++;
            }
            included[k] = 1;
        }
    }

    void display(){
        for(int i=0;i<vertices-1;i++){
            System.out.println("Edge: "+(t[0][i])+"-"+(t[1][i]));

        }
    }

    public static void main(String[] args) {
        kruskalsMinimumCostSpanningTree obj = new kruskalsMinimumCostSpanningTree();
        obj.kruskals();
        obj.display();
    }

}
