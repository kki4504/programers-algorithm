package lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if (budget < 0)
                break;
            answer += 1;
        }
        return answer;
    }
}
