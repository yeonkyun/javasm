package codingtest;

public class Lv1_1_0904 {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] arr = {4, 4, 4, 3, 3};
//        int[] answer = sol.solution(arr);
//        for (int num : answer) {
//            System.out.print(num + " ");
//        }
    }

    class Solution {
        public int[] solution(int[] arr) {
            if (arr == null || arr.length == 0 || arr.length > 1000000) {
                return new int[0];
            }

            for (int num : arr) {
                if (num < 0 || num > 9) {
                    return new int[0];
                }
            }

            int count = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i-1]) {
                    count++;
                }
            }

            int[] answer = new int[count];

            int index = 0;
            answer[index++] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i-1]) {
                    answer[index++] = arr[i];
                }
            }

            return answer;
        }
    }
}
