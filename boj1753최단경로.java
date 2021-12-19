package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer

public class boj1753최단경로 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine()); //시작점
        ArrayList<Node>[] list = new ArrayList[v + 1];
        for (int i = 1; i <= v; i++) {
            list[i] = new ArrayList<>();
        }
        //int[][] arr = new int[v + 1][v + 1];
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, w));
            //a에서 b로
        }

        int[] distance = new int[v + 1];
        boolean[] visited = new boolean[v + 1];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        for (int i = 1; i <= v; i++) {
            int min = Integer.MAX_VALUE;
            int current = 0; // min 최소비용에 해당하는 정점 번호
            // step1. 처리하지 않은 정점 중에 출발지에서 가장 가까운(최소비용) 정점 선택
            for (int j = 1; j <= v; j++) {
                if (!visited[j] && min > distance[j]) {
                    min = distance[j];
                    current = j;
                }
            }
            visited[current] = true;
//            if (current == j) // 마지막 정점에 도달하면 끝!
//                continue;
            // step2.선택된 current를 경유지로 하여 아직 처리하지 않은 다른 정점으로의 최소비용을 따져본다.
            if (list[current] != null) {
                for (Node node : list[current]) {
                    int dest = node.dest;
                    int w = node.w;
                    if (!visited[dest] && distance[dest] > min + w) {
                        distance[dest] = min + w;
                    }
                }
            }

        }
        for (int a = 1; a <= v; a++) {
            if (distance[a] == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(distance[a]);
        }
    }
}

class Node {
    int dest;
    int w;

    Node(int dest, int w) {
        this.dest = dest;
        this.w = w;
    }
}
