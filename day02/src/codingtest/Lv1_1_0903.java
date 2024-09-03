package codingtest;

public class Lv1_1_0903 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;
            if (n >= 3 && n <= 1000000) {
                for (int i = 3; i < n - 1; i++) {
                    if (n % i == 1) {
                        answer = i;
                        break;
                    }
                }
                return answer;
            } else return -1;
        }
    }
}