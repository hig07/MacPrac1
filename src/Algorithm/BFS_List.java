package Algorithm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_List {
    static int n, m, v;
    static boolean visited[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정점 수 : ");
        n = sc.nextInt();
        System.out.print("간선 수 : ");
        m = sc.nextInt();
        System.out.print("시작 정점 : ");
        v = sc.nextInt();

        LinkedList<Integer>[] list = new LinkedList[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i <= n; i++){
            list[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i < m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            list[v1] = list[v2];
            list[v2] = list[v1];
        }

        for(int i = 1; i <= n; i++){
            Collections.sort(list[i]);
        }

        bfs(v, list, visited);

        sc.close();
    }

    public static void bfs(int v, LinkedList<Integer> list[], boolean visited[]){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> iter = list[v].listIterator();
            while(iter.hasNext()){
                int w = iter.next();
                if(visited[w] == false){
                    queue.add(w);
                    visited[w] = true;
                }
            }
        }
    }
}

