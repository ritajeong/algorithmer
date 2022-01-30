import java.util.*;
//틀린 답
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = new int[genres.length-1];
        
        HashMap<String, Integer> sum = new HashMap<>();
        HashMap<String, PriorityQueue<Song>> hm = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {

            String genre = genres[i];
            if(!hm.containsKey(genre))
                hm.put(genre, new PriorityQueue<Song>());
            hm.get(genre).add(new Song(i, plays[i]));

            sum.put(genre, sum.getOrDefault(genre, 0) + plays[i]);
        }


        // Map.Entry 리스트 작성
        List<Map.Entry<String, Integer>> list_entries;
        list_entries = new ArrayList<>(sum.entrySet());

        // 비교함수 Comparator를 사용하여 내림 차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2)
            {
                // 내림 차순으로 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        int cnt = 0;
        for(Map.Entry<String, Integer> entry : list_entries) {
            Song song = hm.get(entry.getKey()).poll();
            answer[cnt++] = song.idx;
             if(entry.getKey().length() !=0) {
                Song song2 = hm.get(entry.getKey()).poll();
                answer[cnt++] = song2.idx;
            } 
        } 
        return answer;
    }
    class Song implements Comparable<Song> {
        int idx;
        int play;

        public Song(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }

        @Override
        public int compareTo(Song o) {
            return this.play <= o.play ? 1 : -1; //재생횟수 오름차순
        }
    }
}
