import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm= new HashMap<>();
        for(String name : completion){ //완주자 먼저
            if (hm.containsKey(name)) {
                hm.replace(name, hm.get(name)+1);
            } else {
                hm.put(name,1);
            }
        }
        for(String name : participant){
            if(hm.containsKey(name)){
                if(hm.get(name) == 1){
                    hm.remove(name);
                }else{
                    hm.replace(name, hm.get(name)-1);
                }
            }else{
                return name;
            }
        }
            return null;
        } 
    }
