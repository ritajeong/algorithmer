import java.util.*;
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
