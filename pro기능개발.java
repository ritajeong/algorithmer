class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int days[] = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            days[i] = ((int) Math.ceil( (double) (100 - progresses[i]) / speeds[i]));
        }

        int maxday = days[0];

        for (int i = 0, j = 0; i < progresses.length; i++) {
            if (days[i] <= maxday) {
                answer[j] += 1;
            } else {
                maxday = days[i];
                answer[++j] = 1;
            }
        }
        
        return answer;
    }
}
