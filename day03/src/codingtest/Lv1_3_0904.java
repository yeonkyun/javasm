package codingtest;

public class Lv1_3_0904 {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] arr = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {
//            {2, 5, 3},
//            {4, 4, 1},
//            {1, 7, 3}
//        };
//        int[] answer = sol.solution(arr, commands);
//        for (int num : answer) {
//            System.out.print(num + " ");
//        }
    }

    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0] - 1;
                int end = commands[i][1] - 1;
                int k = commands[i][2] - 1;

                int[] tempArr = new int[end - start + 1];
                for (int j = 0; j < tempArr.length; j++) {
                    tempArr[j] = array[start + j];
                }

                for (int j = 0; j < tempArr.length - 1; j++) {
                    for (int l = 0; l < tempArr.length - 1 - j; l++) {
                        if (tempArr[l] > tempArr[l + 1]) {
                            int temp = tempArr[l];
                            tempArr[l] = tempArr[l + 1];
                            tempArr[l + 1] = temp;
                        }
                    }
                }

                answer[i] = tempArr[k];
            }

            return answer;
        }
    }
}
