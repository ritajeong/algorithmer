import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hs = new HashSet<>(); //접두어를 모두 저장 1,12까지만 4,45, 7,78

        HashMap<Integer, String> hm = new HashMap<>();
        //접두어에 모두 넣기
        for (String str : phone_book) {
            for (int i = str.length()-1; i >= 1; i--)
                hs.add(str.substring(0, str.length() - i)); //12345 5 , 1 12 123 1234
        }

        //접두어에 들어가는지 봄
        for(String str : phone_book){
            if(hs.contains(str))
                return false;
        }
        return true;
    }
}
