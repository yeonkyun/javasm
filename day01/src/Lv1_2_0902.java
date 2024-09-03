import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv1_2_0902 {
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        System.out.println(sol.solution(0));
    }

    static class Solution {
        public int solution(int n) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("n값 입력하시오: ");
            n = Integer.parseInt(br.readLine());

            if (n >= 0 && n <= 3000) {
                int answer = 0;

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        answer += i;
                    }
                }
                return answer;
            } else return -1;
        }
    }
}