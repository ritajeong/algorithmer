 
package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class pro여행경로 {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}
        String[] answer = {};
        //key, value
        //hash map 1 ) 공항a를 key로, b를 value로 가짐
        //hash map 2 ) key를 공항, value를 visited로 가짐
        //bfs로 풀기

        //X -> 그냥 주어진 2차원 배열을 사용해서, dfs로 풀기. 정렬을 해야함
        //참고한 블로그 글
        //https://sohee-dev.tistory.com/104

//        import java.util.*;
//        import java.io.*;
//
//        class Solution {
//            static String[][] ticketsInfo;
//            static boolean[] used;
//            static List<String> list = new ArrayList<String>();
//            static String[] answer = {};
//
//            public String[] solution(String[][] tickets) {
//                used = new boolean[tickets.length]; // 총 방문 횟수
//                ticketsInfo = tickets;
//
//                Arrays.sort(ticketsInfo, (o1, o2) -> {
//                    if(o1[0].equals(o2[0])) {
//                        return o1[1].compareTo(o2[1]);
//                    } else {
//                        return o1[0].compareTo(o2[0]);
//                    }
//                });
//
//                list.add("ICN");
//                dfs("ICN", 0);
//                return answer;
//            }
//
//            private void dfs(String start, int cnt) {
//                if(answer.length>0) return; // 이미 알파벳이 더 빠른 정답이 나왔는데 dfs가 호출됐다면 return
//
//                if(cnt == used.length) { // 모든 티켓을 다 사용했다면
//                    answer = new String[list.size()]; // answer 초기화
//                    for(int i=0; i<list.size(); i++) {
//                        answer[i] = list.get(i); // answer에 list 값 담기
//                    }
//                    return;
//                }
//
//                for(int i=0 ; i< ticketsInfo.length; i++) { // 모든 티켓을 살펴보면서
//                    // 출발지가 start와 동일하고, 사용하지 않은 티켓이면
//                    if(!used[i] && ticketsInfo[i][0].equals(start)) {
//                        used[i] = true; // i번째 티켓은 사용했다.
//                        list.add(ticketsInfo[i][1]); // i번째 티켓의 도착지 방문
//                        dfs(ticketsInfo[i][1], cnt +1); // 도착지는 출발지(start)가 된다, 다음 티켓 사용(cnt + 1)
//                        // return 된 후, 다른 경우의 수를 살펴보기 위해 아래 두 줄을 추가한다.
//                        used[i] = false; // i번째 사용 여부 false로 바꾸기
//                        list.remove(list.size()-1); // i번째 티켓의 도착지 제거
//                    }
//                }
//            }
//        }
    }
}
