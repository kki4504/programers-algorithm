package lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/77484

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        int correctCnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0)
                answer[0] -= 1;

            for (int i = 0; i < win_nums.length; i++) {
                if (lotto == win_nums[i])
                    correctCnt++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] -= correctCnt;
            if (answer[i] == 7)
                answer[i] = 6;
        }

        return answer;
    }
}
