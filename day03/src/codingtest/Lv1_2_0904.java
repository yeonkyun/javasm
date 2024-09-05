package codingtest;

public class Lv1_2_0904 {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] number = {-2, 3, 0, 2, -5};
//        int answer = sol.solution(number);
//        System.out.println(answer);
    }

    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            int n = number.length;

            if (n < 3 || n > 13) {
                return 0;
            }

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (number[i] + number[j] + number[k] == 0) {
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
    }
}
