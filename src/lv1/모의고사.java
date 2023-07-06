package lv1;

import java.util.*;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[][] supos = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[supos.length];
        int savedAnswer = 0;

        for (int i = 0; i < supos.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == supos[i][j % supos[i].length]) {
                    savedAnswer ++;
                }
            }
            scores[i] = savedAnswer;
            savedAnswer = 0;
        }
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (max == scores[i]) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
