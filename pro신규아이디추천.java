package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class pro신규아이디추천 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.length() == 0) { //5단계
            str = "a";
        } else if (str.length() <= 2) { //7단계
            str += str.charAt(str.length() - 1);
        } else if (str.length() >= 16) { //6단계
            str = str.substring(0, 16); // [0,16)
        }

        str = str.toLowerCase(); //1단계

        if (str.charAt(0) == '.') //4단계
            str = str.substring(1);
        if (str.charAt(str.length() - 1) == '.')
            str = str.substring(0, str.length() - 2);

        //2,3단계 이어붙이기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                sb.append(ch);
            else if(ch >= '0' && ch <='9')
                sb.append(ch);
            else if(ch == '-' || ch == '_')
                sb.append(ch);
            else if(ch == '.'){
                if(i == str.length()-1) break;
                if(str.charAt(i+1)=='.'){
                    i++;
                }
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
