/*
테스트 1 〉	통과 (1.11ms, 74.3MB)
테스트 2 〉	통과 (5.15ms, 78.3MB)
테스트 3 〉	통과 (0.78ms, 72.9MB)
테스트 4 〉	통과 (0.69ms, 71.5MB)
테스트 5 〉	통과 (0.47ms, 68.3MB)
테스트 6 〉	통과 (1.16ms, 71.2MB)
테스트 7 〉	통과 (1.64ms, 78.4MB)
테스트 8 〉	통과 (3.72ms, 73.8MB)
테스트 9 〉	통과 (0.62ms, 87.5MB)
테스트 10 〉	통과 (0.96ms, 72.8MB)
테스트 11 〉	통과 (2.08ms, 78.6MB)
테스트 12 〉	통과 (0.69ms, 78.8MB)
테스트 13 〉	통과 (2.79ms, 73.4MB)
테스트 14 〉	통과 (0.46ms, 71.9MB)
테스트 15 〉	통과 (0.51ms, 70.3MB)
테스트 16 〉	통과 (0.85ms, 77.4MB)
테스트 17 〉	통과 (4.42ms, 73.4MB)
테스트 18 〉	통과 (0.47ms, 72.7MB)
테스트 19 〉	통과 (2.95ms, 73.5MB)
테스트 20 〉	통과 (1.14ms, 82.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Pair(i, priorities[i]));
        }
        int now = 0;
        while(!queue.isEmpty()){
            Pair cur = queue.poll();
            boolean flag = false;
            for(Pair p : queue)
                if(p.priority>cur.priority) flag = true;
            if(flag) queue.add(cur);
            else{
               now++;
               if(cur.index == location){
                   answer = now;
                   break;
               }
            }
        }
        return answer;
    }
    class Pair {
        int index;
        int priority;

        Pair(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
// ABCD
// 2132

// BCDA
/*
ABCD
2132

BCDA
1322

CDAB
3221
*/
