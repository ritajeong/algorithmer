import java.util.*;
/*
테스트 1 〉	통과 (0.10ms, 52.5MB)
테스트 2 〉	통과 (0.06ms, 52MB)
테스트 3 〉	통과 (0.04ms, 54.1MB)
테스트 4 〉	통과 (0.11ms, 52.5MB)
테스트 5 〉	통과 (0.06ms, 52.3MB)
테스트 6 〉	통과 (0.07ms, 52.7MB)
테스트 7 〉	통과 (0.11ms, 52.5MB)
테스트 8 〉	통과 (0.08ms, 51.8MB)
테스트 9 〉	통과 (0.05ms, 54.1MB)
테스트 10 〉	통과 (0.05ms, 53.1MB)
테스트 11 〉	통과 (0.05ms, 53MB)
테스트 12 〉	통과 (0.08ms, 51.6MB)
테스트 13 〉	통과 (0.08ms, 53MB)
테스트 14 〉	통과 (0.05ms, 51.8MB)
테스트 15 〉	통과 (0.08ms, 52.1MB)
테스트 16 〉	통과 (0.04ms, 53.8MB)
테스트 17 〉	통과 (0.09ms, 52.5MB)
테스트 18 〉	통과 (0.08ms, 51.8MB)
테스트 19 〉	통과 (0.09ms, 52.1MB)
테스트 20 〉	통과 (0.06ms, 52.8MB)
테스트 21 〉	통과 (0.05ms, 52.8MB)
테스트 22 〉	통과 (0.05ms, 78.3MB)
테스트 23 〉	통과 (0.06ms, 52.9MB)
테스트 24 〉	통과 (0.06ms, 53.2MB)
테스트 25 〉	통과 (0.07ms, 52.3MB)
테스트 26 〉	통과 (0.12ms, 52.2MB)
테스트 27 〉	통과 (0.07ms, 52.6MB)
테스트 28 〉	통과 (0.10ms, 52.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
class Solution {
    public int solution(String[][] clothes) {

        int ans = 1;
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
 
        for (int i = 0; i < clothes.length; i++) {
            String str0 = clothes[i][0]; // 의상
            String str1 = clothes[i][1]; //종류
            if (!hm.containsKey(str1))
                hm.put(str1, new ArrayList<>());
            hm.get(str1).add(str0);
        }


        for (String key : hm.keySet()) {
            ans *= (hm.get(key).size()+1);
        } 
        return ans-1;
    }
}
