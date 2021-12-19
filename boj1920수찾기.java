package Algorithmer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1920수찾기 {
    static int arr[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st =  new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(bs(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }
    public static int bs(int key) {

        int st = 0;
        int en = arr.length - 1;

        while(st <= en) {
            int mid = (st + en) / 2;
            if(key < arr[mid]) {
                en = mid - 1;
            }
            else if(key > arr[mid]) {
                st = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
