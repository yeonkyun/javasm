package codingtest;

public class Lv1_3_0903 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    class Solution {
        public int solution(int num) {
            int answer = 0;
            if (num >= 1 && num <= 8000000) {
                while (num != 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = num * 3 + 1;
                    }
                    answer++;
                    if (answer == 500) {
                        answer = -1;
                        break;
                    }
                }
                return answer;
            } else return -1;
        }
    }
}
