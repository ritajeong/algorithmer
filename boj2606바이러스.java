 //11636KB	80ms
package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2606바이러스 {
    static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int[][] graph = new int[V + 1][V + 1];
        boolean[] visited = new boolean[V + 1];
        StringTokenizer st = null;

        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }


        dfs(1, V, visited, graph);

        System.out.println(answer - 1);
    }

    static void dfs(int n, int v, boolean[] visited, int[][] graph) {
        visited[n] = true;
        answer++;
        for (int i = 1; i <= v; i++) {
            if (graph[n][i] == 1 && !visited[i]) dfs(i, v, visited, graph);
        }
    }
}
