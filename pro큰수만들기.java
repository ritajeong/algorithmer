//참고 https://jhhj424.tistory.com/32
/*
테스트 1 〉	통과 (0.04ms, 76.8MB)
테스트 2 〉	통과 (0.04ms, 76.5MB)
테스트 3 〉	통과 (0.06ms, 72.9MB)
테스트 4 〉	통과 (0.37ms, 71.2MB)
테스트 5 〉	통과 (0.72ms, 73MB)
테스트 6 〉	통과 (14.91ms, 78.7MB)
테스트 7 〉	통과 (26.25ms, 89MB)
테스트 8 〉	통과 (193.53ms, 101MB)
테스트 9 〉	통과 (17.71ms, 84.8MB)
테스트 10 〉	통과 (7011.47ms, 91MB)
테스트 11 〉	통과 (0.09ms, 76.2MB)
테스트 12 〉	통과 (0.03ms, 75.5MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
