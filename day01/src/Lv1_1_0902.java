import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lv1_1_0902 {
    static class Solution {
        public long[] solution(int x, int n) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("x값 입력하시오: ");
            x = Integer.parseInt(br.readLine());
            System.out.print("n값 입력하시오: ");
            n = Integer.parseInt(br.readLine());

            if (x >= -10000000 && x <= 10000000 && n <= 1000) {
                long[] answer = new long[n];

                for (int i = 0; i < n; i++) {
                    answer[i] = x * (i + 1);
                }

                return answer;
            } else return null;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(0, 0)));
    }
}