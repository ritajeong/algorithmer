import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int size = s.length();
    Set<String> set = new HashSet<>();

    String sum;
    for (int i = 0; i < size; i++) {
		  sum = "";
  		for (int j = i; j < size; j++) {
  			sum += s.charAt(j);
  			set.add(sum);
  		}
  	}
    System.out.println(set.size()); 
  } 
}
