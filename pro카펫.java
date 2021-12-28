package Algorithmer;

public class pro카펫 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        int[] answer = new int[2];
        int area = brown + yellow;
        for (int i = 1; i <= area; i++) {
            int row = i;
            int col = area / row;

            if (row > col) continue;
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                System.out.println(answer[0]+" "+answer[1]);
                break;
            }
        }
    }
}
