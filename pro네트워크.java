package Algorithmer;

import java.util.LinkedList;
import java.util.Queue;
/*
테스트 1 〉	통과 (0.02ms, 76.3MB)
테스트 2 〉	통과 (0.02ms, 71.1MB)
테스트 3 〉	통과 (0.04ms, 83MB)
테스트 4 〉	통과 (0.02ms, 73MB)
테스트 5 〉	통과 (0.01ms, 73.5MB)
테스트 6 〉	통과 (0.06ms, 73.8MB)
테스트 7 〉	통과 (0.02ms, 80.6MB)
테스트 8 〉	통과 (0.06ms, 77.1MB)
테스트 9 〉	통과 (0.06ms, 74.2MB)
테스트 10 〉	통과 (0.05ms, 76.5MB)
테스트 11 〉	통과 (0.28ms, 76.4MB)
테스트 12 〉	통과 (0.16ms, 68.3MB)
테스트 13 〉	통과 (0.09ms, 80.5MB)
 */
public class pro네트워크 {
    static int n;
    static int[][] computers;
    static boolean[] check;

    public static void main(String[] args) {
        //1번부터 bfs돌리기. check안된 vertex를 다시 돌림
        int answer = 0;
        for (int i = 0; i < computers.length; i++) {
            if (!check[i]) {
                dfs(i);
                answer++;
            }
        }

    }

    static void dfs(int x) {
        check[x] = true;
        System.out.println(x);
        for (int i = 0; i < computers.length; i++) {
            if (x != i && computers[x][i] == 1 && !check[i]) dfs(i);
        }
    }
}


/*
제출용 코드
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i, computers, check);
                answer++;
            }
        }
        return answer;
    }
    static void dfs(int x, int[][] computers, boolean[] check) {
        check[x] = true;
        for (int i = 0; i < computers.length; i++) {
            if (x != i && computers[x][i] == 1 && !check[i]) dfs(i, computers, check);
        }
    }
}
 */
