import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv1_3_0902 {
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        System.out.println(sol.solution(0));
    }

    static class Solution {
        public long solution(long n) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("n값 입력하시오: ");
            n = Long.parseLong(br.readLine());

            for (long x = 1; x * x <= n; x++) {
                if (x * x == n) {
                    return (x + 1) * (x + 1);
                }
            }
            return -1;
        }
    }
}