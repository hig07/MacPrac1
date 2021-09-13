package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS1 {
    static int[][] map;
    static boolean[] visited;
    static int n, start, end;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //Scanner와 유사, 더 많은 데이터를 입력받기 좋음
        //예외처리 필수, readLine 사용, 기본 형은 String, 따로 형 변환 필요
        //한 라인의 공백이 필요한 경우 StringTokenizer 사용, nextToken 필요
        n = Integer.parseInt(br.readLine());

        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i <= n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }

        System.out.println("BFS 방문 순서");
        bfs(1);
    }

    public static void bfs(int point){  //point = 시작 정점
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(point);
        visited[point] = true;

        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i = 1; i <= n; i++){
                if(map[x][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    
}
