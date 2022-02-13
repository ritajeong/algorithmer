import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
테스트 1 〉	통과 (0.45ms, 86.8MB)
테스트 2 〉	통과 (0.35ms, 75.5MB)
테스트 3 〉	통과 (0.34ms, 77.9MB)
테스트 4 〉	통과 (0.32ms, 78.7MB)
테스트 5 〉	통과 (0.31ms, 76.1MB)
테스트 6 〉	통과 (0.32ms, 72.5MB)
테스트 7 〉	통과 (0.43ms, 81.3MB)
*/
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int answer[] = new int[commands.length];
        int cnt = 0;
        for(int i=0;i< commands.length;i++){
            if(commands[i][0] == commands[i][1]){
                answer[cnt++] = array[commands[i][0]-1];
            }else{
                int tmp[] = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(tmp);
                answer[cnt++] = tmp[commands[i][2]-1];
            }
        }
        return answer;
    }
}
