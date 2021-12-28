package Algorithmer;

import java.util.ArrayList;
import java.util.Arrays;

public class pro모의고사 {
    public static void main(String[] args) {
        int answers[] = {1, 3, 2, 4, 2,2,4,3,4,2,3,1,5,3,2,4,5,1,3,2};
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt[] = new int[3];
        String first = "12345";
        String second = "21232425";
        String third = "3311224455";
        String strAnswers = Arrays.toString(answers).replaceAll("[^0-9]", "");
        System.out.println(strAnswers);
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        for (int i = 0; i < answers.length; i++) {
            System.out.println(idx1);
            if (idx1 == 5) idx1 = 0;
            if (idx2 == 8) idx2 = 0;
            if (idx3 == 10) idx3 = 0;
            if (strAnswers.charAt(i) == first.charAt(idx1))
                cnt[0]++;
            if (strAnswers.charAt(i) == second.charAt(idx2))
                cnt[1]++;
            if (strAnswers.charAt(i) == third.charAt(idx3))
                cnt[2]++;
            idx1++;
            idx2++;
            idx3++;
        }

//        System.out.println(Arrays.toString(cnt));

        int max = cnt[0];
        int maxIdx = 0;
        for (int i = 1; i < 3; i++) { //maxIdx구하기
            if (cnt[i] > max) {
                max = cnt[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < 3; i++) { //중복값구하기
            if (max == cnt[i]) {
                answer.add(i + 1);
            }
        }

        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }

        System.out.println(Arrays.toString(ans));

    }
}
