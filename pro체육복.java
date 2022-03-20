/*
테스트 1 〉	통과 (0.43ms, 74.5MB)
테스트 2 〉	통과 (0.46ms, 73.6MB)
테스트 3 〉	통과 (0.50ms, 73.7MB)
테스트 4 〉	통과 (0.36ms, 74.5MB)
테스트 5 〉	통과 (0.39ms, 77MB)
테스트 6 〉	통과 (0.54ms, 72.9MB)
테스트 7 〉	통과 (0.48ms, 75.9MB)
테스트 8 〉	통과 (0.59ms, 73.7MB)
테스트 9 〉	통과 (0.46ms, 75.7MB)
테스트 10 〉	통과 (0.54ms, 74.3MB)
테스트 11 〉	통과 (0.52ms, 67.3MB)
테스트 12 〉	통과 (0.45ms, 78.9MB)
테스트 13 〉	통과 (0.56ms, 65.5MB)
테스트 14 〉	통과 (0.39ms, 66.2MB)
테스트 15 〉	통과 (0.46ms, 75.4MB)
테스트 16 〉	통과 (0.42ms, 80.7MB)
테스트 17 〉	통과 (0.53ms, 74MB)
테스트 18 〉	통과 (0.42ms, 72.3MB)
테스트 19 〉	통과 (0.37ms, 74.7MB)
테스트 20 〉	통과 (0.39ms, 66.4MB)
*/
import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        } 
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if((lost[i] - 1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }
}
