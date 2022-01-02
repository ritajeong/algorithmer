package Algorithmer;
//https://fbtmdwhd33.tistory.com/237 참고

public class pro타겟넘버 {
    static int answer;
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        answer = 0;

        // 2. dfs수행.
        dfs(numbers,target,0,0);

        System.out.println(answer);
    }
    static void dfs(int[] numbers,int target,int idx,int sum){
        // 4. 모든 정수를 탐색했을 때,
        if(idx == numbers.length){
            // 5. 누적합이 target과 동일하면 answer++ 후 메소드 종료.
            if(sum == target) answer++;
            return;
        }

        // 6. 현재 인덱스의 정수를 +로 합해준다.
        sum+=numbers[idx];
        // 7. 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);
        // 8. 6.의 값을 다시 빼준 뒤,
        sum-=numbers[idx];
        // 9. 현재 인덱스의 정수를 -로 합해준다.
        sum+=(-1 * numbers[idx]);
        // 10. 다시 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);
    }
}
