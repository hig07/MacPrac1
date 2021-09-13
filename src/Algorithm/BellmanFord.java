package Algorithm;

public class BellmanFord {  //이중 for문 알고리즘
    //(n - 1) * E = O(n * E) = O(N ^ 3) ::E는 간선의 갯수이며 최대 n^2
    //음수 가중치에서 음수 사이클 판단을 위해 정점 개수가 N일 때 최단 경로 크기는 최대 N - 1
    /*
    for i in range(n - 1):  # n - 1 번 루프
        for each edge(u, v) in G :
                if dist[v] > dist[u] + w(u, v)
                    relax(u, v)
    */
    static int u, v;
    static int upper[];
    static boolean updated;
    public static void main(String[] args){
        updated = false;
        upper[1] = 0;

    }

    public static void weight(int u, int v){

    }

    public static void relax(){

    }
}
