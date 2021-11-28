package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2941크로아티아 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum++;
            if (i == str.length() - 1) break;
            if (str.charAt(i) == 'c') {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (str.charAt(i) == 'd') {
                if (str.charAt(i + 1) == '-') {
                    i++;
                } else if (i != str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                    i += 2;
                }
            } else if (str.charAt(i) == 'l' || str.charAt(i) == 'n') {
                if (str.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (str.charAt(i) == 's' || str.charAt(i) == 'z') {
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }
        }
        System.out.println(sum);
    }
}
