package codingtest;

public class Lv1_2_0903 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public class Solution {
        public int solution(int n) {
            int answer = 0;
            if (n >= 0 && n <= 100000000) {
                while (n > 0) {
                    answer += n % 10;
                    n /= 10;
                }
                return answer;
            } else return -1;

        }
    }
}
