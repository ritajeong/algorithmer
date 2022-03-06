/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 77.4MB)
테스트 2 〉	통과 (0.03ms, 76.1MB)
테스트 3 〉	통과 (0.15ms, 77.5MB)
테스트 4 〉	통과 (0.15ms, 78.1MB)
테스트 5 〉	통과 (0.31ms, 79MB)
테스트 6 〉	통과 (0.02ms, 73.6MB)
테스트 7 〉	통과 (0.10ms, 77MB)
테스트 8 〉	통과 (0.11ms, 80.8MB)
테스트 9 〉	통과 (0.01ms, 73.1MB)
테스트 10 〉	통과 (0.20ms, 74.4MB)
효율성  테스트
테스트 1 〉	통과 (16.07ms, 67.8MB)
테스트 2 〉	통과 (14.40ms, 63.9MB)
테스트 3 〉	통과 (20.85ms, 71.2MB)
테스트 4 〉	통과 (12.52ms, 67MB)
테스트 5 〉	통과 (11.30ms, 61.2MB)
*/

class Solution {
    public int[] solution(int[] prices) { 
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) break;
            }
        }
        return answer;
    }
}
