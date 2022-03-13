/*
테스트 1 〉	통과 (0.42ms, 79.4MB)
테스트 2 〉	통과 (0.49ms, 74.3MB)
테스트 3 〉	통과 (0.61ms, 75.8MB)
테스트 4 〉	통과 (0.40ms, 72.6MB)
테스트 5 〉	통과 (0.32ms, 81.4MB)
테스트 6 〉	통과 (2.55ms, 75.5MB)
테스트 7 〉	통과 (1.93ms, 72MB)
테스트 8 〉	통과 (1.29ms, 73MB)
테스트 9 〉	통과 (0.76ms, 65.7MB)
테스트 10 〉	통과 (2.29ms, 80.9MB)
테스트 11 〉	통과 (1.19ms, 84.5MB)
테스트 12 〉	통과 (2.63ms, 77.8MB)
테스트 13 〉	통과 (2.39ms, 77.4MB)
테스트 14 〉	통과 (0.53ms, 75.4MB)
테스트 15 〉	통과 (2.71ms, 75.3MB)
테스트 16 〉	통과 (0.34ms, 79.6MB)
효율성  테스트
테스트 1 〉	통과 (150.01ms, 67.1MB)
테스트 2 〉	통과 (285.20ms, 86.7MB)
테스트 3 〉	통과 (1264.46ms, 122MB)
테스트 4 〉	통과 (145.94ms, 65.6MB)
테스트 5 〉	통과 (1879.57ms, 126MB)
*/
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int j : scoville) {
            heap.add(j);
        }
        while (heap.element() < K) {
            if (heap.size() == 1) return -1;
            heap.add(heap.remove() + (heap.remove()*2));
            answer++;
        }
        return answer;
    }
}
