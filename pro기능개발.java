/*
테스트 1 〉	통과 (0.20ms, 78.5MB)
테스트 2 〉	통과 (0.36ms, 82.6MB)
테스트 3 〉	통과 (0.24ms, 76.3MB)
테스트 4 〉	통과 (0.25ms, 72.4MB)
테스트 5 〉	통과 (0.20ms, 76MB)
테스트 6 〉	통과 (0.20ms, 79.7MB)
테스트 7 〉	통과 (0.27ms, 78.7MB)
테스트 8 〉	통과 (0.20ms, 74.5MB)
테스트 9 〉	통과 (0.22ms, 77.5MB)
테스트 10 〉	통과 (0.22ms, 81.8MB)
테스트 11 〉	통과 (0.22ms, 79.8MB)
*/
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        int[] answer = new int[progresses.length+1];
        int maxday = days[0];
        int endOfIndex = 0;

        for (int i = 0; i < progresses.length; i++) {
            days[i] = ((int) Math.ceil( (double) (100 - progresses[i]) / speeds[i]));

            if (days[i] <= maxday) {
                answer[endOfIndex] += 1;
            } else {
                maxday = days[i];
                answer[++endOfIndex] = 1;
            }
        }
        
        return Arrays.copyOfRange(answer, 1,endOfIndex+1);
    }
}
