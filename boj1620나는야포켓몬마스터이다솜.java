import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    HashMap<String, Integer> map = new HashMap<String, Integer>();
    String[] arr = new String[n+1];
    
    for(int i=1;i<=n;i++){
      String s = br.readLine();
      map.put(s,i);
      arr[i] = s;
    }

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<m;i++){
      String s = br.readLine();
      if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
        sb.append(arr[Integer.parseInt(s)]);
    
      }else{
        sb.append(map.get(s));
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
  } 
}
